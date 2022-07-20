package com.project2.repository;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.project2.entities.requests;

public class RequestsTest {
    public static RequestsDAOInterface requestsDao;
    @BeforeClass
    public static void setup(){
       
        requestsDao = new RequestsDAO();
    }
     //testing Requests 
    @Test
    public void creatRequests()
    {
         requests testRequests= new requests("quyen6",
         "personal",500,"pending","pending","Quyen");
         requests result = requestsDao.creatRequests(testRequests);
         Assert.assertNotNull(result.getId());
    }

     // Test Get all requests
     @Test
     public void getAllEmployees()
     {
         List<requests> requestsList = requestsDao.getAllRequests();
         Assert.assertTrue(requestsList.size()>=2);
     }
    
     @Test
     public void removeRequest()
     {
        requests requestsToBeDeleted = new requests(8, "Quyen6","personal", 500,"pending", 
        "pending", "Quyen");
        boolean result = requestsDao.removeRequest(requestsToBeDeleted);
        Assert.assertTrue(result);
    }

    public void ManagerstatusUpdated(){
        requests updatedRequests = new requests(5, "tester2.0", "test again", 250, "Approved", "I can", "philip");
        requests result = requestsDao.ManagerstatusUpdated(updatedRequests);
        Assert.assertEquals("Approved", result.getRequest_status());
    }
}
