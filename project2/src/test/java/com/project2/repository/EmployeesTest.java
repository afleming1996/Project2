package com.project2.repository;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.project2.entities.employees;

public class EmployeesTest {
    public static EmployeesDAOInterface employeeDAO;
    
    @BeforeClass
    public static void setup(){
        employeeDAO = new EmployeesDAO();
    }

    @Test
    public void getEmployees() {
        List<employees> employeesList = employeeDAO.getAllEmployees();
        Assert.assertTrue(employeesList.size()>=2);
    }

    @Test
    public void CheckUserCridential(){
        List<employees> employees = employeeDAO.CheckUserCridential("Requester1", "password");
        Assert.assertNotNull(employees);
    }
    
    @Test
    public void CheckUserCridentialNegative(){
        List<employees> employees = employeeDAO.CheckUserCridential("porkbellies", "d");
        Assert.assertTrue(employees.size()==0);
    }
}