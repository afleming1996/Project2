package com.project2.service;

import com.project2.entities.requests;

public interface RequestsServiceInterface {
    boolean statusReason(requests statusReason);

    boolean requestReason(requests requestReason);

    boolean requestAmount(requests requestAmount);
}
