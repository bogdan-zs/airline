package ua.kpi.bogdan.airline.command;

import ua.kpi.bogdan.airline.dao.BrigadeDAO;
import ua.kpi.bogdan.airline.dao.DAOFactory;
import ua.kpi.bogdan.airline.entity.Brigade;
import ua.kpi.bogdan.airline.entity.Employee;
import ua.kpi.bogdan.airline.exception.AppException;
import ua.kpi.bogdan.airline.web.Pages;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class BrigadeInformationCommand extends Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, AppException {
        Integer brigadeId = Integer.parseInt(request.getParameter("id"));
        DAOFactory factory = DAOFactory.getDAOFactory();
        BrigadeDAO dao = factory.getBrigadeDAO();
        System.err.println("id = " + brigadeId);
        Brigade brigade = dao.getBrigadeById(brigadeId);
        List<Employee> empsInBrigade = dao.getEmployeesInBrigade(brigadeId);
        List<Employee> freeEmployees = dao.getFreeEmployees();
        request.setAttribute("empsInBrigade", empsInBrigade);
        request.setAttribute("freeEmps", freeEmployees);
        request.setAttribute("brigade", brigade);
        String forward = Pages.PAGE_EDIT_BRIGADE;
        return forward;
    }

}
