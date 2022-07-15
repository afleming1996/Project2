package com.project2.service;

import org.junit.BeforeClass;
import org.junit.Test;

import com.project2.repository.RequestsDAO;
import com.project2.repository.RequestsDAOInterface;

public class RequestsServiceTests {
    public static RequestsDAOInterface requestsDao;
    public static RequestsServiceInterface requestsService;

    @BeforeClass
    public static void setup(){
        requestsDao = new RequestsDAO();
        requestsService = new RequestsService(requestsDao); 
    }


    @Test
    public void testnamehere(){
        
    }

    @Test
    public void testnamehereagain(){

    }
}
