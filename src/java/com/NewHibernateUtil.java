/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;



public class NewHibernateUtil {

  private static SessionFactory sessionFactory;
    
    public static SessionFactory getSessionFactory() {
        if  (sessionFactory == null){
             Configuration configuration = new Configuration().configure();
             StandardServiceRegistry serviceRegistry = 
                     new StandardServiceRegistryBuilder()
                             .applySettings(configuration.getProperties()).build();
             sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        }
        return sessionFactory;
    }
}