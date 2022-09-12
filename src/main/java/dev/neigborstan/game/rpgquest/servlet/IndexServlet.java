package dev.neigborstan.game.rpgquest.servlet;

import dev.neigborstan.game.rpgquest.repository.Repository;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("")
public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Repository repo = (Repository) req.getServletContext().getAttribute("repository");
        req.setAttribute("users", repo.getUsers());

        getServletContext().getRequestDispatcher("/jsp/index.jsp").forward(req, resp);
    }
}
