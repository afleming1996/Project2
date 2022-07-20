package com.project2.service;

import com.project2.entities.requests;

public interface RequestsServiceInterface {
    //manager
    boolean statusReason(requests statusReason);




    //requester/employee
    boolean requestReason(requests requestReason);

    boolean requestAmount(requests requestAmount);

    boolean getMyRequests(requests getMyRequests);

    //both
   // boolean uniqueUsername(requests uniqueUsername);

    
}
