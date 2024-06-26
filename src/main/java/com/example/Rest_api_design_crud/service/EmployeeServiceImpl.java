package com.example.Rest_api_design_crud.service;

import com.example.Rest_api_design_crud.dao.EmployeeDAO;
import com.example.Rest_api_design_crud.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO theEmployeeDAO){
        employeeDAO = theEmployeeDAO;
    }
    @Override
    public List<Employee> findAll() {

        return employeeDAO.findAll();
    }
}
