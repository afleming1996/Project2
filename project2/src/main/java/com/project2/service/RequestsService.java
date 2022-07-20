package com.project2.service;

import java.util.List;

import com.project2.Utils.BusinessRules;
import com.project2.entities.requests;
import com.project2.repository.RequestsDAOInterface;


public class RequestsService implements RequestsServiceInterface {

    private RequestsServiceInterface RequestsService;

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
   
}
