package com.project2.service;

import java.util.List;

import com.project2.entities.requests;

public interface RequestsServiceInterface {
    //manager
    boolean statusReason(requests statusReason);

    //requester/employee
    boolean requestReason(requests requestReason);
    boolean requestAmount(requests requestAmount);
    List<requests> getMyRequests();

    //both
    requests serviceUpdateRequests(requests requestToBeUpdated);
    requests createRequest(requests newRequest);
}
