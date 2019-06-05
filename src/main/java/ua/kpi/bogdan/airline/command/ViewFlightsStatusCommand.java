package ua.kpi.bogdan.airline.command;

import ua.kpi.bogdan.airline.dao.DAOFactory;
import ua.kpi.bogdan.airline.dao.FlightDAO;
import ua.kpi.bogdan.airline.entity.Flight;
import ua.kpi.bogdan.airline.exception.AppException;
import ua.kpi.bogdan.airline.web.Pages;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ViewFlightsStatusCommand extends Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, AppException {
        DAOFactory factory = DAOFactory.getDAOFactory();
        FlightDAO dao = factory.getFlightDAO();
        List<Flight> flights = dao.getFlights();
        request.setAttribute("flights", flights);
        return Pages.PAGE_EDIT_FLIGHTS;
    }

}
