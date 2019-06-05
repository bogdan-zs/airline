package ua.kpi.bogdan.airline.command;

import ua.kpi.bogdan.airline.dao.DAOFactory;
import ua.kpi.bogdan.airline.dao.EmployeeDAO;
import ua.kpi.bogdan.airline.exception.AppException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RemoveEmployeeCommand extends Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, AppException {
        Integer id = Integer.parseInt(request.getParameter("id"));
        DAOFactory factory = DAOFactory.getDAOFactory();
        EmployeeDAO dao = factory.getEmployeeDAO();
        dao.removeEmployee(id);
        return "/controller?command=viewEmployees";
    }

}
