package com.project2.service;

import com.project2.entities.requests;

public class requestsService implements requestsServiceInterface {

    private requestsServiceInterface requestsService;

    public requestsService(requestsServiceInterface requestsService){
        this.requestsService = requestsService;
    }

    @Override
    public boolean statusReason(requests statusReason) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean requestReason(requests requestReason) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean requestAmount(requests requestAmount) {
        // TODO Auto-generated method stub
        return false;
    }
    
}
