package com.project2.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;
import com.project2.entities.employees;
import com.project2.entities.requests;
import com.project2.exceptions.InvalidRequests;
import com.project2.service.EmployeesServiceInterface;
import com.project2.service.RequestsServiceInterface;

import io.javalin.http.Handler;

public class RequestsController {
    private RequestsServiceInterface requestsService;
    private EmployeesServiceInterface employeesService;
    private Gson gson;

    public RequestsController(RequestsServiceInterface requestsService)
    {
        this.requestsService = requestsService;
        this.gson = new Gson();
    }

    public Handler getHelloWorld = ctx -> {
        ctx.result("Hello world!");
        ctx.status(200);

    };

   public Handler getAllRequests = ctx -> { 
    List<requests> requests = this.requestsService.getMyRequests();
    // the toJson method provided by Gson turns our collection of Book objects into a formatted string
    String requestsJSON = this.gson.toJson(requests);
    // we use the ctx.result() method to attach the booksJSON to the response body
    ctx.result(requestsJSON);
    ctx.status(200);
    };
    
    public Handler updateRequest = ctx -> {
        try{
            // get json from request body
            String json = ctx.body();
            // convert json to our java object
            requests updatedrequest = this.gson.fromJson(json, requests.class);
            // this does the same process of getting the id from the path and setting it as the id of the updated book
            updatedrequest.setId(Integer.parseInt(ctx.pathParam("id")));
            // pass the data into the service layer and get method result back
            requests result = this.requestsService.serviceUpdateRequests(updatedrequest);
            // convert the result into a json
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
    public Handler createRequests = ctx -> {
        try{
            String json = ctx.body();
            requests newRequest = this.gson.fromJson(json, requests.class);
            requests result = this.requestsService.creatRequest(newRequest);
            String resultJson = this.gson.toJson(result);
            ctx.result(resultJson);
            ctx.status(201);
        }catch(InvalidRequests e){
            Map<String, String> message = new HashMap<>();
            message.put("message", e.getMessage());
            String messageJson = this.gson.toJson(message);
            ctx.result(messageJson);
            ctx.status(400);
        }
    };

  

}
