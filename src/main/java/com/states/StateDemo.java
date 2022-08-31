package com.states;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.tut.Certificate;
import com.tut.Student;

public class StateDemo {
	public static void main(String[] args) {
		
		//trasient
		//persistent
		//detached
		//removed
		
		System.out.println("Example....");
		
		SessionFactory f=new Configuration().configure().buildSessionFactory();
		
		//creating student object
		Student student=new Student();
		student.setId(1414);
		student.setName("Parth");
		student.setCity("Delhi");
		student.setCerti(new Certificate("java hibernate course","2 months"));
		//student : transient
		
		Session s= f.openSession();
		Transaction tx =s.beginTransaction();
		s.save(student);
		//student : persistent - assosiate with session,database
		tx.commit();
		
		
		f.close();
	}

}
