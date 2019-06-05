package ua.kpi.bogdan.airline.command;

import ua.kpi.bogdan.airline.dao.ApplicationDAO;
import ua.kpi.bogdan.airline.dao.DAOFactory;
import ua.kpi.bogdan.airline.entity.Application;
import ua.kpi.bogdan.airline.exception.AppException;
import ua.kpi.bogdan.airline.web.Pages;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ViewApplicationsCommand extends Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, AppException {
        DAOFactory factory = DAOFactory.getDAOFactory();
        ApplicationDAO dao = factory.getApplicationDAO();
        List<Application> applications = dao.getApplications();
        request.setAttribute("apps", applications);
        request.setAttribute("status", "all");
        return Pages.PAGE_VIEW_APPS;
    }

}
