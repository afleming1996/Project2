package com.project2.entities;

public class employees {
    private int id;
    private String employee_name;
    private String username; 
    private String employee_role;

    public employees(){}

    public employees(String employee_name, String username, String employee_role) {
        this.employee_name = employee_name;
        this.username = username;
        this.employee_role = employee_role;
    }
    
    public employees(int id, String employee_name, String username, String employee_role) {
        this.id = id;
        this.employee_name = employee_name;
        this.username = username;
        this.employee_role = employee_role;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmployee_role() {
        return employee_role;
    }

    public void setEmployee_role(String employee_role) {
        this.employee_role = employee_role;
    }

    @Override
    public String toString() {
        return "employees{" + "id=" + id + ", employee_name=" + employee_name + ", username=" + username + ", employee_role=" + employee_role + '}';
    }

}
