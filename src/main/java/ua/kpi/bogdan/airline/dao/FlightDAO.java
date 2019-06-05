package ua.kpi.bogdan.airline.dao;

import ua.kpi.bogdan.airline.entity.Flight;
import ua.kpi.bogdan.airline.exception.DBException;

import java.sql.Date;
import java.util.List;

public interface FlightDAO {
    Flight getFlightById(Integer id) throws DBException;

    List<Flight> getFlightsByParameters(String from, String to, Date date) throws DBException;

    List<Flight> getFlights() throws DBException;

    void addFlight(Flight flight) throws DBException;

    void removeFlight(Integer id) throws DBException;

    void updateFlight(Integer id, Flight flight) throws DBException;

}
