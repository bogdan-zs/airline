package ua.kpi.bogdan.airline.command;

import ua.kpi.bogdan.airline.dao.DAOFactory;
import ua.kpi.bogdan.airline.dao.EmployeeDAO;
import ua.kpi.bogdan.airline.entity.Employee;
import ua.kpi.bogdan.airline.exception.AppException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddEmployeeCommand extends Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, AppException {
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        Integer profId = Integer.parseInt(request.getParameter("profession"));
        DAOFactory factory = DAOFactory.getDAOFactory();
        EmployeeDAO dao = factory.getEmployeeDAO();
        if (firstName == null || firstName.isEmpty() || lastName == null || lastName.isEmpty()) {
            throw new AppException();
        }
        Employee e = new Employee();
        e.setFirstName(firstName);
        e.setLastName(lastName);
        System.err.println("first name -->" + firstName);
        System.err.println("last name -->" + lastName);
        e.setProfessionId(profId);
        dao.addEmployee(e);
        return "/controller?command=viewEmployees";
    }

}
