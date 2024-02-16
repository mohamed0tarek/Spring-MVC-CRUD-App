package com.springbootmvcthymeleaf.employeecrud.repository;

import com.springbootmvcthymeleaf.employeecrud.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
