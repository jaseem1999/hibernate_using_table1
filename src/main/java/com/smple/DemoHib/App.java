package com.smple.DemoHib;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
        StudentDTO st1  = new StudentDTO();
        st1.setName("Jaseem");
        st1.setColor("Red");
        
        Configuration cfg = new Configuration().configure().addAnnotatedClass(StudentDTO.class);
        
        SessionFactory sf = cfg.buildSessionFactory();
        
        Session session = sf.openSession();
        
        Transaction tx = session.beginTransaction();
        session.save(st1);
        tx.commit();
        System.out.println("Insertion Successfully");
    }
}
