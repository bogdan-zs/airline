package ua.kpi.bogdan.airline.command;

import ua.kpi.bogdan.airline.exception.AppException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class NoCommand extends Command {

    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, AppException {
        // TODO Auto-generated method stub
        return null;
    }

}
