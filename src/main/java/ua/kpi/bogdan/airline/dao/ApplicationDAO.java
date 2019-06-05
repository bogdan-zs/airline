package ua.kpi.bogdan.airline.dao;

import ua.kpi.bogdan.airline.entity.Application;
import ua.kpi.bogdan.airline.entity.status.ApplicationStatus;
import ua.kpi.bogdan.airline.exception.DBException;

import java.util.List;

public interface ApplicationDAO {

    Application getApplicationById(Integer id) throws DBException;

    List<Application> getApplications() throws DBException;

    List<Application> getOpenedApplications() throws DBException;

    void changeStatus(Integer id, ApplicationStatus status) throws DBException;

    void addApplication(Application app) throws DBException;


}
