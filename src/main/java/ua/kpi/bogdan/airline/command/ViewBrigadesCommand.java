package ua.kpi.bogdan.airline.command;

import ua.kpi.bogdan.airline.dao.BrigadeDAO;
import ua.kpi.bogdan.airline.dao.DAOFactory;
import ua.kpi.bogdan.airline.entity.Brigade;
import ua.kpi.bogdan.airline.exception.AppException;
import ua.kpi.bogdan.airline.web.Pages;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ViewBrigadesCommand extends Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, AppException {
        DAOFactory factory = DAOFactory.getDAOFactory();
        BrigadeDAO dao = factory.getBrigadeDAO();
        List<Brigade> brigades = dao.getBrigades();
        request.setAttribute("brigades", brigades);
        String forward = Pages.PAGE_VIEW_BRIGADES;
        return forward;
    }

}
