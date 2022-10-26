/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import net.sf.ehcache.hibernate.HibernateUtil;
import org.apache.catalina.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;




public class NewMain {
   public static int register(orden u) {
        int i = 0;
        
        SessionFactory sessionFactory =  NewHibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        //StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
        //Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
        Transaction t = session.beginTransaction();

        i = (Integer) session.save(u);

        t.commit();
        session.close();

        return i;

    }

    public void updatePer(orden O) {
     Transaction trns = null;
     Session session = NewHibernateUtil.getSessionFactory().openSession();
     try{
      trns = session.beginTransaction();
      session.update(O);
      session.getTransaction().commit();
     }catch(RuntimeException e ) {
       if(trns != null){
       trns.rollback();
     }
       e.printStackTrace();
     }finally{
       session.flush();
     }
    }

    public void updatePer(admin1 r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void updatePer(AP r) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}

