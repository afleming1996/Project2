package com.project2.repository;

import java.util.List;

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
    public employees CheckUserCridential() {
        HibernateUtil.beginTransaction();
        employees checkEmployeesInfo = HibernateUtil.getSession().createQuery("from employees",employees.class).uniqueResult();
        HibernateUtil.getSession().delete(checkEmployeesInfo);
        HibernateUtil.endTransaction();
        return checkEmployeesInfo;
    }

    
}
