package dev.neigborstan.game.rpgquest.servlet;

import dev.neigborstan.game.rpgquest.repository.Repository;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppContextListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Repository repository = Repository.getInstance();
        ServletContext ctx = servletContextEvent.getServletContext();

        ctx.setAttribute("repository", repository);

    }

}
