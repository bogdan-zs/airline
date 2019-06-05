package ua.kpi.bogdan.airline.command;

import ua.kpi.bogdan.airline.dao.DAOFactory;
import ua.kpi.bogdan.airline.dao.EmployeeDAO;
import ua.kpi.bogdan.airline.entity.Employee;
import ua.kpi.bogdan.airline.entity.Profession;
import ua.kpi.bogdan.airline.exception.AppException;
import ua.kpi.bogdan.airline.web.Pages;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ViewEmployeesCommand extends Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, AppException {
        DAOFactory factory = DAOFactory.getDAOFactory();
        EmployeeDAO dao = factory.getEmployeeDAO();
        List<Employee> employees = dao.getEmployees();
        request.setAttribute("employees", employees);
        request.setAttribute("profs", Profession.values());
        System.err.println(employees.size());

        return Pages.PAGE_VIEW_EMPLOYEES;
    }

}
