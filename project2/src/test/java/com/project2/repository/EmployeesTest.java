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
}
