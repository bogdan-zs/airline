package ua.kpi.bogdan.airline.dao;

import ua.kpi.bogdan.airline.entity.User;
import ua.kpi.bogdan.airline.exception.DBException;

import java.util.List;

public interface UserDAO {

    User getUserById(Integer id) throws DBException;

    User getUserByLogin(String login) throws DBException;

    List<User> getUsers() throws DBException;

    boolean addUser(User user) throws DBException;

    boolean removeUser(Integer id) throws DBException;

}
