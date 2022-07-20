package com.project2.service;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

import com.project2.Utils.BusinessRules;
import com.project2.entities.requests;
import com.project2.repository.RequestsDAO;
import com.project2.repository.RequestsDAOInterface;

public class RequestsServiceTests {
    public static RequestsDAOInterface requestsDao;
    public static RequestsServiceInterface requestsService;
    public static BusinessRules businessRules;

    public static RequestsDAOInterface mockDao;
    public static RequestsServiceInterface mockService;
    public static BusinessRules mockRules;

    @BeforeClass
    public static void setup() {
        businessRules = new BusinessRules();
        mockDao = Mockito.mock(RequestsDAO.class);
        mockRules = Mockito.mock(BusinessRules.class);
        mockService = new RequestsService(mockDao, mockRules);
    }


    @Test
    public void statusReasonPositiveTest(){ 
        requests goodStatusRequest = new requests("porkbellies",
                "personal",500,"Pending","pending","dodgeball");
        boolean result = businessRules.statusReason(goodStatusRequest);
        Assert.assertTrue(result);
    }

    @Test 
    public void statusReasonNegativeTest(){
        requests badStatusRequest = new requests("porkbellies",
                "personal",500,"Pending","Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus","dodgeball");
        boolean result = businessRules.statusReason(badStatusRequest);
        Assert.assertFalse(result);
        }
    

    @Test
    public void requestReasonPositiveTest(){ 
        requests goodRequestReason = new requests("porkbellies",
                "personal",500,"Pending","pending","dodgeball");
        boolean result = businessRules.requestReason(goodRequestReason);
        Assert.assertTrue(result);
    }

    @Test
    public void requestReasonNegativeTest(){ 
            requests badRequestReason = new requests("porkbellies",
                "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Aenean commodo ligula eget dolor. Aenean massa. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus. Donec quam felis, ultricies nec, pellentesque eu, pretium quis, sem. Nulla consequat massa quis enim. Donec pede justo, fringilla vel, aliquet nec, vulputate eget, arcu. In enim justo, rhoncus ut, imperdiet a, venenatis vitae, justo. Nullam dictum felis eu pede mollis pretium. Integer tincidunt. Cras dapibus",500,"Pending","pending","dodgeball");
            boolean result = businessRules.requestReason(badRequestReason);
            Assert.assertFalse(result);
    }

    @Test
    public void requestAmountPositiveTest(){ 
        requests goodRequestAmount = new requests("porkbellies",
                "personal",500,"Pending","pending","dodgeball");
        boolean result = businessRules.requestAmount(goodRequestAmount);
        Assert.assertTrue(result);
    }

    @Test
    public void requestAmountNegativeTest(){ 
        
            requests badRequestAmount = new requests("porkbellies",
                "personal",1001,"Pending","pending","dodgeball");
            boolean result = businessRules.requestAmount(badRequestAmount);
            Assert.assertFalse(result);
        }
}
