package ua.kpi.bogdan.airline.command;

import ua.kpi.bogdan.airline.exception.AppException;
import ua.kpi.bogdan.airline.web.Pages;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LogoutCommand extends Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, AppException {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        return Pages.PAGE_LOGIN;
    }

}
