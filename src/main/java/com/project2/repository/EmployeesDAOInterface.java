package com.project2.repository;

import java.util.List;

import com.project2.entities.employees;

public interface EmployeesDAOInterface {
    List<employees> getAllEmployees();
    List<employees> CheckUserCridential(String InputUsername, String InputPassword);
}
