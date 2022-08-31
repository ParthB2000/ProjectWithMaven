package com.hql;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.tut.Student;

public class HQLExample {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session s=factory.openSession();
		//HQL syntax
		String quary="from Student";
		
		Query q=s.createQuery(quary);
		
		//single-uniq or multiple-list result
		List<Student>list= q.list();
		
		for(Student student:list)
		{
			System.out.println(student.getName());
		}
		
		s.close();
		factory.close();
	}
}
