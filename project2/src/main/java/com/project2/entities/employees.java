package com.project2.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employees")
public class employees {
    @Id
    @GeneratedValue
    private int id;
    private String employee_name;
    private String employee_role;
    private String username; 
    private String user_password;

    public employees(){}

    public employees(String employee_name, String username, String employee_role, String user_password) {
        this.employee_name = employee_name;
        this.employee_role = employee_role;
        this.username = username;
        this.user_password = user_password;
    }
    
    public employees(int id, String employee_name, String username, String employee_role, String user_password) {
        this.id = id;
        this.employee_name = employee_name;
        this.employee_role = employee_role;
        this.username = username;
        this.user_password = user_password;
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
    
    public String getEmployee_role() {
        return employee_role;
    }

    public void setEmployee_role(String employee_role) {
        this.employee_role = employee_role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    @Override
    public String toString() {
        return "employees{" + "id=" + id + ", employee_name=" + employee_name + ", employee_role=" + employee_role + ", username=" + username + ", user_password=" + user_password + '}';
    }

}
