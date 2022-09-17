package dev.neigborstan.game.rpgquest.servlet;

import dev.neigborstan.game.rpgquest.entity.Answer;
import dev.neigborstan.game.rpgquest.entity.Location;
import dev.neigborstan.game.rpgquest.entity.Question;
import dev.neigborstan.game.rpgquest.entity.User;
import dev.neigborstan.game.rpgquest.repository.Repository;

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

@WebServlet("/person")
public class DialogServlet extends HttpServlet {
    private Repository repo = null;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        ServletContext servletContext = config.getServletContext();
        repo = (Repository) servletContext.getAttribute("repository");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        int personId;
        String answerIdParam = req.getParameter("answerId");
        String personIdParam = req.getParameter("personId");

        if (personIdParam != null) {
            personId = Integer.parseInt(personIdParam);
            session.setAttribute("personId", personId);
        } else {
            personId = 0;
        }

        Question question = repo.getPersonInit().getPersonById(personId).getStartQuestion();

        if (answerIdParam != null) {
            question = repo.getAnswerInit().getAnswerById(Integer.parseInt(answerIdParam)).getNext();
        }

        if (isDialogSuccess(question)) {
            String userName = (String) session.getAttribute("userName");
            User user = repo.getUserInit().getUserByName(userName);
            Location blockedLocation = repo.getPersonInit().getPersonById(personId).getKey().getLocation();
            user.getLocationInit().getLocationById(blockedLocation.getId()).setBlock(false);
        }

        List<Answer> answers = repo.getAnswerInit().getAnswersByQuestionId(question.getId());
        req.setAttribute("question", question);
        req.setAttribute("answers", answers);

        getServletContext().getRequestDispatcher("/jsp/action.jsp").forward(req, resp);
    }

    private boolean isDialogSuccess(Question question) {
        return question.getType() == Question.Type.SUCCESS;
    }
}
