package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        
        Student student1 = new Student();
        student1.setId(14134);
        student1.setName("Ankit Tiwari");
        student1.setCity("Lucknow");
        
        Certificate certificate = new Certificate();
        certificate.setCourse("Android");
        certificate.setDuration("2 months");
        
        student1.setCerti(certificate);
        
        Student student2 = new Student();
        student2.setId(101);
        student2.setName("Ravi Tiwari");
        student2.setCity("Delhi");
        
        Certificate certificate2 = new Certificate();
        certificate2.setCourse("Java");
        certificate2.setDuration("4 months");
        
        student2.setCerti(certificate2);
        
        Session s = factory.openSession();
        Transaction tx=s.beginTransaction();	
        
        //objects save
        s.save(student1);
        s.save(student2);
        
        tx.commit();
        s.close();
        factory.close();
	}

}
