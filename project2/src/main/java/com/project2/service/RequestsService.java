package com.project2.service;

import java.util.List;

import com.project2.Utils.BusinessRules;
import com.project2.entities.requests;
import com.project2.exceptions.InvalidRequests;
import com.project2.repository.RequestsDAOInterface;


public class RequestsService implements RequestsServiceInterface {

    private RequestsDAOInterface requestsDao;
    private BusinessRules businessRules;

    public RequestsService(RequestsDAOInterface requestsDao, BusinessRules businessRules){
        this.requestsDao = requestsDao;
        this.businessRules=businessRules;
    }

    @Override
    public boolean statusReason(requests statusReason) {
        if(businessRules.statusReason(statusReason)){
            requestsDao.statusUpdated(statusReason);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean requestReason(requests requestReason) {
        if(businessRules.requestReason(requestReason)){
            requestsDao.createRequests(requestReason);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean requestAmount(requests requestAmount) {
        if(businessRules.requestAmount(requestAmount)){
            requestsDao.createRequests(requestAmount);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public List<requests> getMyRequests() {
        return requestsDao.getAllRequests();
    }

    @Override
    public requests serviceUpdateRequests(requests requestToBeUpdated) {
        if(this.businessRules.requestAmount(requestToBeUpdated) && 
        this.businessRules.requestReason(requestToBeUpdated) &&
        this.businessRules.statusReason(requestToBeUpdated)){
            return this.requestsDao.statusUpdated(requestToBeUpdated);
        }else {
            throw new InvalidRequests("invalid Request: please try again");
        }
    }

    @Override
    public requests creatRequest(requests newRequest) {
        if(this.businessRules.requestAmount(newRequest) && 
        this.businessRules.requestReason(newRequest) &&
        this.businessRules.statusReason(newRequest)){
            return this.requestsDao.createRequests(newRequest);
        }else {
            throw new InvalidRequests("invalid Request: please try again");
        }
    }
   
    
}
