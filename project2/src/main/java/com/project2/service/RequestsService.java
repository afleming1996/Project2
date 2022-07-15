package com.project2.service;

import com.project2.entities.requests;

public class RequestsService implements RequestsServiceInterface {

    private RequestsServiceInterface RequestsService;

    public RequestsService(RequestsServiceInterface requestsService){
        this.RequestsService = requestsService;
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
