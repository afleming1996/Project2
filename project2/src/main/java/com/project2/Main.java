package com.project2;


import com.project2.Utils.BusinessRules;
import com.project2.controllers.RequestsController;
import com.project2.repository.RequestsDAO;
import com.project2.repository.RequestsDAOInterface;
import com.project2.service.RequestsService;
import com.project2.service.RequestsServiceInterface;

import io.javalin.Javalin;

public class Main {

    public static void main(String[] args) {
        
        // inside of the create method we call a lambda that Javalin can use to configure our web server
        Javalin app = Javalin.create(config ->{
            config.enableCorsForAllOrigins();
            config.enableDevLogging();
        });

        /*
            For our controller class to be able to send information to the service layer for validation it
            must be given a service object. However, that service object requires its own dependencies to work
            correctly, so this is where we create our official objects for our repository and service layers so
            that our API can correctly send information where it needs to go
        */

        RequestsDAOInterface RequestsDao = new RequestsDAO();
        BusinessRules businessRules = new BusinessRules();
        RequestsServiceInterface bookService = new RequestsService(RequestsDao, businessRules);
        RequestsController RequestsController = new RequestsController(bookService);

        /*
            the code below is used to "expose" these endpoints so that users can "consume" them. Any hhtp
            requests that don't use the resources and path parameters listed below will be rejected by the system.
        */


        app.get("/hello", RequestsController.getHelloWorld);

        /*
            notice that my path strings all include book in them: this is part of creating a restful web service, something we will talk
            more about tomorrow
        */

        // book here indicates the resource this http request works with
        app.get("/requests", RequestsController.getAllRequests); // this is fine, does not need an identifier

        // the id inside the {} is called a path parameter: I can use the ctx in the controller to access it
        //      app.delete("/book/{id}", bookController.deleteBook); 

        app.patch("/requests/{id}", RequestsController.updateRequest); 

        // despite working with an individual resource, this route does not need an identifier because the identifier will be created in the course of this endpoint being consumed
              app.post("/requests", RequestsController.createRequests);
        app.start(); // this actually starts our web server so it can listen for http requests

    }
}
