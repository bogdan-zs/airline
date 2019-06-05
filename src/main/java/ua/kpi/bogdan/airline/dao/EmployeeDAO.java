package ua.kpi.bogdan.airline.dao;

import ua.kpi.bogdan.airline.entity.Employee;
import ua.kpi.bogdan.airline.exception.DBException;

import java.util.List;

public interface EmployeeDAO {
    Employee getEmployeeById(Integer id) throws DBException;

    Employee getEmployeeByLastName(String lastName) throws DBException;

    List<Employee> getEmployees() throws DBException;

    void addEmployee(Employee employee) throws DBException;

    void removeEmployee(Integer id) throws DBException;

    void changeEmployeeData(Employee employee) throws DBException;


}
