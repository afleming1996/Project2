package com.project2.Utils;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
    
    private static Session session;
    private static Transaction transaction;
    private static SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            Configuration cfg = new Configuration();
            cfg.configure("hibernate.cfg.xml");
            sessionFactory = cfg.buildSessionFactory();
        }
        return sessionFactory;
    }
    public static void beginTransaction() {
        session = getSessionFactory().openSession();
        transaction = session.beginTransaction();   
    }

    public static void endTransaction() {
        transaction.commit();
        session.close();
}

    public static Session getSession() {
        return session;
    }
}

