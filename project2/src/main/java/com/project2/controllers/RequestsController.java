package com.project2.controllers;

import java.util.List;

import com.google.gson.Gson;
import com.project2.entities.requests;
import com.project2.service.RequestsServiceInterface;

import io.javalin.http.Handler;

public class RequestsController {
    private RequestsServiceInterface requestsService;
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

   

}
