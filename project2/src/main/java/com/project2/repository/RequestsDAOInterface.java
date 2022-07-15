package com.project2.repository;

import com.project2.entities.requests;

public interface RequestsDAOInterface {
    requests creatRequests(requests newRequests);

    requests statusUpdated(requests statusUpdated);


}
