package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
	
	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        //creating quetion
        Question q1=new Question();
        q1.setQuestionid(1212);
        q1.setQuestion("What is java ?");
        
        //creating answer
        Answer answer=new Answer();
        answer.setAnswerId(343);
        answer.setAnswer("Java is programming language");
        answer.setQuestion(q1);
//        q1.setAnswer(answer);
        
        Answer answer1=new Answer();
        answer1.setAnswerId(33);
        answer1.setAnswer("With the help of java we can create softwares");
        answer1.setQuestion(q1);
        
        Answer answer2=new Answer();
        answer2.setAnswerId(363);
        answer2.setAnswer("Java has different frame works");
        answer2.setQuestion(q1);
        
        List<Answer>list=new ArrayList<Answer>();
        list.add(answer);
        list.add(answer1);
        list.add(answer2);
        
        q1.setAnswer(list);
        
        //creating quetion
//        Question q2=new Question();
//        q2.setQuestionid(242);
//        q2.setQuestion("What is collection framework ?");
//        
//        
//        //creating answer
//        Answer answer1=new Answer();
//        answer1.setAnswerId(344);
//        answer1.setAnswer("API to work with object in java");
//        answer1.setQuestion(q2);
//        q2.setAnswer(answer1);
        
        //session
        Session s = factory.openSession();
        
        Transaction tx=s.beginTransaction();
        
        //save
//        s.save(q1);
//        s.save(q2);
//        s.save(answer);
//        s.save(answer1);
        //s.save(q1);
        //s.save(answer);
        //s.save(answer1);
        //s.save(answer2);
        
        Question q=(Question)s.get(Question.class, 1212);
        System.out.println(q.getQuestionid());
        System.out.println(q.getQuestion());
        
        //lazy loading
        //System.out.println(q.getAnswer().size());
        
        tx.commit();
        
        //fetching
//       Question newQ=(Question)s.get(Question.class, 1212);
//       System.out.println(newQ.getQuestion());
//       System.out.println(newQ.getAnswer().getAnswer());
        
        s.close();
        
        factory.close();
	}

}
