package ua.kpi.bogdan.airline.command;

import ua.kpi.bogdan.airline.dao.DAOFactory;
import ua.kpi.bogdan.airline.dao.UserDAO;
import ua.kpi.bogdan.airline.entity.User;
import ua.kpi.bogdan.airline.exception.AppException;
import ua.kpi.bogdan.airline.web.Pages;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ViewUsersCommand extends Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, AppException {
        DAOFactory factory = DAOFactory.getDAOFactory();
        UserDAO dao = factory.getUserDAO();
        List<User> users = dao.getUsers();
        request.setAttribute("users", users);
        return Pages.PAGE_VIEW_USERS;
    }

}
