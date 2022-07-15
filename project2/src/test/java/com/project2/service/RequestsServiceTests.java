package com.project2.service;

import org.junit.BeforeClass;
import org.junit.Test;

import com.project2.repository.requestsDAO;
import com.project2.repository.requestsDAOInterface;

public class RequestsServiceTests {
    public static requestsDAOInterface requestsDao;
    public static requestsServiceInterface requestsService;

    @BeforeClass
    public static void setup(){
        requestsDao = new requestsDAO();
        requestsService = new requestsService(requestsDao); 
    }


    @Test
    public void testnamehere(){
        
    }

    @Test
    public void testnamehereagain(){

    }
}
