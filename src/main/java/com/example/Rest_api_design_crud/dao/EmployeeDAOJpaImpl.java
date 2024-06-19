package com.example.Rest_api_design_crud.dao;

import com.example.Rest_api_design_crud.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository

public class EmployeeDAOJpaImpl implements EmployeeDAO{
    //define fielf for entitymanager

    private EntityManager entityManager;
//set up constuctor
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager){
        entityManager =theEntityManager;
    }
    @Override
    public List<Employee> findAll() {



        //create a query
        TypedQuery<Employee> theQuery =entityManager.createQuery("from Employee",Employee.class);

        //Execute the Query and get result
        List<Employee> employees =theQuery.getResultList();
        //return the result
        return employees;
    }

    @Override
    public Employee findById(int theId) {

        //get employee
        Employee theEmployee =entityManager.find(Employee.class,theId);
        //return the employee
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {

        //save employee
        Employee dbEmployee =entityManager.merge(theEmployee);

        return dbEmployee;
    }

    @Override
    public void deleteById(int theId) {

        //find employee by id

        Employee theEmployee = entityManager.find(Employee.class,theId);
         entityManager.remove(theEmployee);
    }


}
