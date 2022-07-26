package com.project2.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.project2.entities.employees;
import com.project2.exceptions.InvalidRequests;
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
            try{
                String json = ctx.body();
                employees empToBeChecked = this.gson.fromJson(json, employees.class);
                empToBeChecked.setUsername(ctx.pathParam("username"));
                empToBeChecked.setUser_password(ctx.pathParam("password"));
                List<employees> result = this.employeesService.CheckUserCridential(empToBeChecked.getUsername(), empToBeChecked.getUser_password());
                String resultJson = this.gson.toJson(result);
                // set the response body and status code
                ctx.result(resultJson);
                ctx.status(200);

            }catch(InvalidRequests e){
                       // create a map to easily make key/value pair for json
            Map<String, String> message = new HashMap<>();
            // place the exception message into the map
            message.put("message", e.getMessage());
            // convert the map into a json
            String messageJson = this.gson.toJson(message);
            // attach the json to the response body and set the status code
            ctx.result(messageJson);
            ctx.status(400);
            }
    };
   
}
