package com.project2.repository;

import java.util.List;

import com.project2.Utils.HibernateUtil;
import com.project2.entities.requests;

public class RequestsDAO implements RequestsDAOInterface {

    @Override
    public requests createRequests(requests newRequests) {
        HibernateUtil.beginTransaction();
        HibernateUtil.getSession().save(newRequests);
        HibernateUtil.endTransaction();
        return newRequests;
    }

    @Override
    public requests statusUpdated(requests statusUpdated) {
        HibernateUtil.beginTransaction();
        HibernateUtil.getSession().update(statusUpdated);
        HibernateUtil.endTransaction();
        return statusUpdated;
    }
    @Override
    public List<requests> getAllRequests() {
        HibernateUtil.beginTransaction();      
        List<requests> requestsList = HibernateUtil.getSession().createQuery("from requests",
         requests.class).getResultList();
        HibernateUtil.endTransaction();       
         return requestsList;
    }

    @Override
    public boolean removeRequest(requests requestsToBeDeleted) {
        HibernateUtil.beginTransaction();
        HibernateUtil.getSession().delete(requestsToBeDeleted);
        return true;
    }
}
    

