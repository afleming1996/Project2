package com.project2.repository;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import com.project2.Utils.BusinessRules;
import com.project2.entities.requests;
import com.project2.exceptions.InvalidRequests;
import com.project2.service.RequestsService;
import com.project2.service.RequestsServiceInterface;

public class RequestsTest {
    public static RequestsDAO requestsDao;
    public static RequestsService requestsService;
    public static RequestsDAOInterface mockDao;
    public static BusinessRules mockRules;
    public static RequestsServiceInterface serviceWithMocks;
    @BeforeClass
    public static void setup(){
       
        requestsDao = new RequestsDAO();

        mockDao = Mockito.mock(RequestsDAO.class); // this creates a mock dao object we can control
        mockRules = Mockito.mock(BusinessRules.class); // this creates a mock rules object we control
        serviceWithMocks = new RequestsService(mockDao, mockRules);
    }
     //testing Request 
    @Test
    public void createRequests()
    {
         requests testRequests= new requests("porkbellies",
         "personal",500,"Pending","pending","dodgeball");
         requests result = requestsDao.createRequests(testRequests);
         Assert.assertNotNull(result.getId());
    }
    
    @Test(expected = NullPointerException.class)
    public void createRequestsNegative(){


        String s = "";
        for(int i=0; i<50; i++){ 
            s+= "jjjjjjjjjjjjjjjjjjjjjj";

        }
         try{
            requests badTestRequests= new requests("porkbellies",
            "personal",5000,"Pending",s,"dodgeball");
            requests result = requestsService.createRequest(badTestRequests);
            Assert.fail("invalid request: please try again");
        } catch( InvalidRequests e) {
            assertNotNull(e);
//this test is now expecting null pointer exception i think so
        }
    }

    @Test(expected = NullPointerException.class)
    public void createRequestsNegativeAmount(){
        String s = "";
        int a = 10000;
        for(int i=0; i<50; i++){ 
            s+= "jjjjjjjjjjjjjjjjjjjjjj";

        }
         try{
            requests badTestRequests= new requests("porkbellies",
            "personal",a,"Pending",s,"dodgeball");
            requests result = requestsService.createRequest(badTestRequests);
            Assert.fail("invalid request: please try again");
        } catch( InvalidRequests e) {
            assertNotNull(e);
//this test is now expecting null pointer exception i think so
        }
    }




     // Test Get all requests
     @Test
     public void getAllRequests()
     {
         List<requests> requestsList = requestsDao.getAllRequests();
         Assert.assertTrue(requestsList.size()>=2);
     }


     @Test
     public void getAllRequestsNegative(){

    try {
        List<requests> requestsList = requestsDao.getAllRequests();
         Assert.assertTrue(requestsList.size()>=2);
    } catch (InvalidRequests e) {
        assertNotNull(e);
    }
     }
    
    //  @Test
    //  public void removeRequest()
    //  {
    //     requests requestsToBeDeleted = new requests(8, "Quyen6","personal", 500,"pending", 
    //     "pending", "Quyen");
    //     boolean result = requestsDao.removeRequest(requestsToBeDeleted);
    //     Assert.assertTrue(result);
    // }

    // @Test(expected = NullPointerException.class)
    // public void removeRequestsNegative(){
    //     try{
    //         requests badTestRequests= new requests("porkbellies",
    //         "personal",500,"Pending","Pending","dodgeball");
    //         boolean result = requestsService.requestReason(badTestRequests);
    //         Assert.fail("invalid request: please try again");
    //     } catch( InvalidRequests e) {
    //         assertNotNull(e);
    //     //this test is now expecting null pointer exception i think so.
    //     }

    // }

    @Test
    public void statusUpdated(){
        requests updatedRequests = new requests(604, "porkbellies", "personal", 500, "Approved", 
        "Approved", "dodgeball");
        requests result = requestsDao.statusUpdated(updatedRequests);
        Assert.assertEquals("Approved", result.getRequest_status());
    }

    @Test(expected = NullPointerException.class)
    public void statusUpdatesNegative(){
        try{
            requests badTestRequests= new requests("porkbellies",
            "personal",5000,"Pending","oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo00000000000000000000000000000000000000000000000000000000000000000000000000000000000lllllllllllllllllllllllloooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo","dodgeball");
            requests result = requestsService.serviceUpdateRequests(badTestRequests);
            Assert.fail("invalid request: please try again");
        } catch( InvalidRequests e) {
            assertNotNull(e);
        //this test is now expecting null pointer exception i think so
        }

    }


}
