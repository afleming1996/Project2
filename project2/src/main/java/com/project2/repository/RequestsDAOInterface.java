package com.project2.repository;

import java.util.List;

import com.project2.entities.requests;

public interface RequestsDAOInterface {
    requests createRequests(requests newRequests);

    requests statusUpdated(requests statusUpdated);

    List<requests> getAllRequests();

    boolean removeRequest(requests requestsToBeDeleted);

}
