package com.project2.repository;

import java.util.List;

import com.project2.Utils.HibernateUtil;
import com.project2.entities.employees;

public class employeesDAO implements employeesDAOInterface {

    @Override
    public List<employees> getEmployees() {
        HibernateUtil.beginTransaction();
        List<employees> employees = HibernateUtil.getSession().createQuery("from employees").list();
        HibernateUtil.getSession().close();
        return employees;
    }

    
}
