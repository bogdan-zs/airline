package ua.kpi.bogdan.airline.command;

import ua.kpi.bogdan.airline.dao.DAOFactory;
import ua.kpi.bogdan.airline.dao.FlightDAO;
import ua.kpi.bogdan.airline.exception.AppException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DeleteFlightCommand extends Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, AppException {
        Integer flightId = Integer.parseInt(request.getParameter("id"));
        DAOFactory factory = DAOFactory.getDAOFactory();
        FlightDAO dao = factory.getFlightDAO();
        dao.removeFlight(flightId);
        return "/controller?command=viewFlights";
    }

}
