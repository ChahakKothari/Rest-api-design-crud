package com.example.Rest_api_design_crud.dao;

import com.example.Rest_api_design_crud.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(int theId);

    Employee save (Employee theEmployee);

    void deleteById(int theId);
}
