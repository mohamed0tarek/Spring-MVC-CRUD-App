package com.springbootmvcthymeleaf.employeecrud.service;

import com.springbootmvcthymeleaf.employeecrud.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAllEmployees();
    Employee findEmpById(int id);
    void createEmployee(Employee employee);
    void deleteEmployee(int id);
}
