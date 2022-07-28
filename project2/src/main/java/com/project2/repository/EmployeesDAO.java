package com.project2.repository;

import java.util.List;

import javax.persistence.Query;

import com.project2.Utils.HibernateUtil;
import com.project2.entities.employees;

public class EmployeesDAO implements EmployeesDAOInterface {

    @Override
    public List<employees> getAllEmployees() {
        HibernateUtil.beginTransaction();
        List<employees> employeesList = HibernateUtil.getSession().createQuery("from employees", employees.class).getResultList();
        HibernateUtil.endTransaction();
        return employeesList;
    }

    @Override
    public List<employees> CheckUserCridential(String InputUsername, String InputPassword) {
        HibernateUtil.beginTransaction();
        String SQLReq= "From employees where username=: username and user_password=:user_password";
        Query query = HibernateUtil.getSession().createQuery(SQLReq);
        query.setParameter("username", InputUsername);
        query.setParameter("user_password", InputPassword);
        List<employees> employeesList = query.getResultList();
        HibernateUtil.endTransaction();
        return employeesList;
    } 
}
