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
        mockDao = Mockito.mock(RequestsDAO.class); 
        mockRules = Mockito.mock(BusinessRules.class); 
        serviceWithMocks = new RequestsService(mockDao, mockRules);
    }

    @Test
    public void createRequests(){
         requests testRequests= new requests("Requester1",
         "test request reason",500,"Pending","test status reason","Manager1");
         requests result = requestsDao.createRequests(testRequests);
         Assert.assertNotNull(result.getId());
    }
    
    // excessive characters request
    @Test(expected = NullPointerException.class)
    public void createRequestsNegative(){
        String s = "";
        for(int i=0; i<50; i++){ 
            s+= "jjjjjjjjjjjjjjjjjjjjjj";
        } try{
            requests badTestRequests= new requests("Requester1",
            s,500,"Pending","test status reason","Manager1");
            requests result = requestsService.createRequest(badTestRequests);
            Assert.fail("invalid request: please try again");
        } catch( InvalidRequests e) {
            assertNotNull(e);
        }
    }

    // excessive money request
    @Test(expected = NullPointerException.class)
    public void createRequestsNegativeAmount(){
        try{
            requests badTestRequests= new requests("Requester1",
            "test request reason",10000,"Pending","test status reason","Manager1");
            requests result = requestsService.createRequest(badTestRequests);
            Assert.fail("invalid request: please try again");
        } catch( InvalidRequests e) {
            assertNotNull(e);
        }
    }

    @Test
    public void getAllRequests(){
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

    // manager tests
    @Test
    public void statusUpdated(){
        requests updatedRequests = new requests(1, "Requester1", "test request reason", 500, "Approved", 
        "Approved", "Manager1");
        requests result = requestsDao.statusUpdated(updatedRequests);
        Assert.assertEquals("Approved", result.getRequest_status());
    }

    @Test(expected = NullPointerException.class)
    public void statusUpdatesNegative(){
        try{
            requests badTestRequests= new requests("Requester1",
            "test request reason",500,"Pending","oooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo00000000000000000000000000000000000000000000000000000000000000000000000000000000000lllllllllllllllllllllllloooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooooo","dodgeball");
            requests result = requestsService.serviceUpdateRequests(badTestRequests);
            Assert.fail("invalid request: please try again");
        } catch( InvalidRequests e) {
            assertNotNull(e);
        }
    }
}
