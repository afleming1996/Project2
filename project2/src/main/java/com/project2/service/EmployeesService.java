package com.project2.service;

import java.util.List;


import com.project2.entities.employees;
import com.project2.repository.EmployeesDAOInterface;

public class EmployeesService implements EmployeesServiceInterface{
    
    private EmployeesDAOInterface employeesDao;
 
    public EmployeesService(EmployeesDAOInterface employeesDAO) {
        this.employeesDao = employeesDAO;
    }


    //List of all existing employees
    @Override 
    public List<employees> getAllEmployees() {
       
        return employeesDao.getAllEmployees();
    }


    @Override
    public employees CheckUserCridential() {
        
        return employeesDao.CheckUserCridential();
    }
}
