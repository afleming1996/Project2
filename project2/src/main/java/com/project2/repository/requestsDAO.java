package com.project2.repository;

import com.project2.Utils.HibernateUtil;
import com.project2.entities.requests;

public class requestsDAO implements requestsDAOInterface {

    @Override
    public requests creatRequests(requests newRequests) {
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

}
    

