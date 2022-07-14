package com.project2.repository;

import com.project2.entities.requests;

public interface requestsDAOInterface {
    requests creatRequests(requests newRequests);

    requests statusUpdated(requests statusUpdated);


}
