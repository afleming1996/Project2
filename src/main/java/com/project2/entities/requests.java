package com.project2.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "requests")
public class requests {
    @Id
    @GeneratedValue
    private int id;
    private String requester_username;
    private String request_reason;
    private int amount;
    private String request_status;
    private String status_reason;
    private String manager_username;


    public requests(){}


    public requests(String requester_username, String request_reason, int amount, String request_status, String status_reason, String manager_username) {
        this.requester_username = requester_username;
        this.request_reason = request_reason;
        this.amount = amount;
        this.request_status = request_status;
        this.status_reason = status_reason;
        this.manager_username = manager_username;
    }

    public requests(int id, String requester_username, String request_reason, int amount, String request_status, String status_reason, String manager_username) {
        this.id = id;
        this.requester_username = requester_username;
        this.request_reason = request_reason;
        this.amount = amount;
        this.request_status = request_status;
        this.status_reason = status_reason;
        this.manager_username = manager_username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRequester_username() {
        return requester_username;
    }

    public void setRequester_username(String requester_username) {
        this.requester_username = requester_username;
    }

    public String getRequest_reason() {
        return request_reason;
    }

    public void setRequest_reason(String request_reason) {
        this.request_reason = request_reason;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getRequest_status() {
        return request_status;
    }

    public void setRequest_status(String request_status) {
        this.request_status = request_status;
    }

    public String getStatus_reason() {
        return status_reason;
    }

    public void setStatus_reason(String status_reason) {
        this.status_reason = status_reason;
    }

    public String getManager_username() {
        return manager_username;
    }

    public void setManager_username(String manager_username) {
        this.manager_username = manager_username;
    }

    @Override
    public String toString() {
        return "requests{" + "id=" + id + ", employee_name=" + requester_username + ", request_reason=" + request_reason + ", amount=" + 
        amount + ", request_status=" + request_status + ", status_reason=" + status_reason + ", manager_name=" + manager_username + '}';
    }

    
}
