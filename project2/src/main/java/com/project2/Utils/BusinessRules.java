package com.project2.Utils;

import com.project2.entities.requests;

public class BusinessRules {
    
    public static boolean statusReason(requests statusReason) {
        if (statusReason.getStatus_reason().length() < 500) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean requestReason(requests requestReason) {
        if (requestReason.getRequest_reason().length() < 500) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean requestAmount(requests requestAmount) {
        if (requestAmount.getAmount() < 1000) {
            return true;
        } else {
            return false;
        }
    }

    public boolean getMyRequest(requests seeRequests, String username){

        if(seeRequests.getRequester_username().equals(username)){
             return true;
        }
        else{
            return false;

        }
    }

}
