package com.project2.entities;

public class requests {
    private int id;
    private String employee_name;
    private String request_reason;
    private int amount;
    private String request_status;
    private String status_reason;
    private String manager_name;


    public requests(){}


    public requests(String employee_name, String request_reason, int amount, String request_status, String status_reason, String manager_name) {
        this.employee_name = employee_name;
        this.request_reason = request_reason;
        this.amount = amount;
        this.request_status = request_status;
        this.status_reason = status_reason;
        this.manager_name = manager_name;
    }

    public requests(int id, String employee_name, String request_reason, int amount, String request_status, String status_reason, String manager_name) {
        this.id = id;
        this.employee_name = employee_name;
        this.request_reason = request_reason;
        this.amount = amount;
        this.request_status = request_status;
        this.status_reason = status_reason;
        this.manager_name = manager_name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
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

    public String getManager_name() {
        return manager_name;
    }

    public void setManager_name(String manager_name) {
        this.manager_name = manager_name;
    }

    @Override
    public String toString() {
        return "requests{" + "id=" + id + ", employee_name=" + employee_name + ", request_reason=" + request_reason + ", amount=" + amount + ", request_status=" + request_status + ", status_reason=" + status_reason + ", manager_name=" + manager_name + '}';
    }

    
}
