package com.jocata.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.jocata.entity.Employee;

@Repository
public interface EmployeeDao {

    List<Employee> getAllEmployees();

    Employee getEmployeeById(Long id);

    void addEmployee(Employee employee);

    void updateEmployee(Employee employee);

    void deleteEmployee(Long id);
}
