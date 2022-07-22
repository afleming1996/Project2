package com.project2.controllers;

import java.util.List;

import com.google.gson.Gson;
import com.project2.entities.employees;
import com.project2.service.EmployeesServiceInterface;

import io.javalin.http.Handler;

public class EmployeesController {

 
    private EmployeesServiceInterface employeesService;

    public EmployeesController(EmployeesServiceInterface employeesService)
    {
        this.employeesService = employeesService;
        this.gson = new Gson();
    }

    private Gson gson;
  //This is for the Login Page to load all employees information
    //So that it will compare the user input to database
    public Handler getAllEmployees = ctx -> { 
        List<employees> employees = this.employeesService.getAllEmployees();
        // the toJson method provided by Gson turns our collection of Book objects into a formatted string
        String employeesJSON = this.gson.toJson(employees);
        // we use the ctx.result() method to attach the booksJSON to the response body
        ctx.result(employeesJSON);
        ctx.status(200);
    };

    public Handler CheckUserCridential = ctx -> {
            
    };
   
}
