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
        // requestsService = new RequestsService(requestsDao); 
    }


    @Test
    public void statusReason(){ // manager gives reason for status
        // need something
    }

    @Test
    public void requestReason(){ // requester gives reason for request
        // testing for alert if requestReason string has fewer than 0 and greater than 500 chars
    }

    @Test
    public void requestAmount(){ // requester enters amount
        // assertThat() ...number from webpage < 1000
            //...can't page be set up to max out at 1k?
    }

    @Test
    public void otherRequestersNotVisible(){ // requester views (only their) reimbursement requests

    }

    // @Test
    // ...log in with correct credentials

    // @Test
    // ...check for unique usernames?
}
