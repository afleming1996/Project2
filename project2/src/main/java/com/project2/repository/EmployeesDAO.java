package com.project2.repository;

import java.util.List;

import com.project2.Utils.HibernateUtil;
import com.project2.entities.employees;

public class EmployeesDAO implements EmployeesDAOInterface {

    @Override
    public List<employees> getEmployees() {
        HibernateUtil.beginTransaction();
        List<employees> employees = HibernateUtil.getSession().createQuery("from employees", employees.class).getResultList();
        HibernateUtil.getSession().close();
        return employees;
    }

    
}
