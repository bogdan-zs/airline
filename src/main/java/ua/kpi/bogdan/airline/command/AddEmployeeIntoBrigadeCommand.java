package ua.kpi.bogdan.airline.command;

import ua.kpi.bogdan.airline.dao.BrigadeDAO;
import ua.kpi.bogdan.airline.dao.DAOFactory;
import ua.kpi.bogdan.airline.exception.AppException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddEmployeeIntoBrigadeCommand extends Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, AppException {
        DAOFactory factory = DAOFactory.getDAOFactory();
        BrigadeDAO dao = factory.getBrigadeDAO();
        Integer brigadeId = Integer.parseInt(request.getParameter("brigadeId"));
        Integer empId = Integer.parseInt(request.getParameter("idEmp"));
        dao.addEmployeeIntoBrigade(brigadeId, empId);
        String forward = "/controller?command=brigadeInf&id=" + brigadeId;
        return forward;
    }

}
