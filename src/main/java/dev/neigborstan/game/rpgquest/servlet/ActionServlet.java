package dev.neigborstan.game.rpgquest.servlet;

import dev.neigborstan.game.rpgquest.repository.Repository;
import dev.neigborstan.game.rpgquest.entity.Location;
import dev.neigborstan.game.rpgquest.entity.Person;
import dev.neigborstan.game.rpgquest.entity.User;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/action")
public class ActionServlet extends HttpServlet {
    private Repository repo = null;
    private final int START_LOCATION_ID = 1;
    private final int END_LOCATION_ID = 14;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        ServletContext servletContext = config.getServletContext();
        repo = (Repository) servletContext.getAttribute("repository");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        int selectedLocationId;

        String userName = (String) session.getAttribute("userName");
        String locationIdParam = req.getParameter("locationId");
        String locationIdForContinue = (String) req.getAttribute("locationIdForContinue");

        if (locationIdParam != null) {
            selectedLocationId = Integer.parseInt(locationIdParam);
        } else if (locationIdForContinue != null) {
            selectedLocationId = Integer.parseInt(locationIdForContinue);
        } else {
            selectedLocationId = START_LOCATION_ID;
        }

        User user = repo.getUserInit().getUserByName(userName);
        user.setCurrentLocationId(selectedLocationId);

        Location location = user.getLocationInit().getLocationById(selectedLocationId);
        List<Location> locationsForMovement = location.getLocationsForMovement();

        if (selectedLocationId == END_LOCATION_ID) {
            req.setAttribute("win", true);
        }

        List<Person> personsOnLocation = repo.getPersonInit().getPersonsByLocationId(selectedLocationId);
        if (personsOnLocation.isEmpty()) {
            session.removeAttribute("personsOnLocation");
        } else {
            session.setAttribute("personsOnLocation", personsOnLocation);
        }
        session.setAttribute("currentLocation", location);
        session.setAttribute("locationsForMovement", locationsForMovement);

        getServletContext().getRequestDispatcher("/jsp/action.jsp").forward(req, resp);
    }
}
