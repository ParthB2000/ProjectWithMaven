package com.tut;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws IOException
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        
        //creating student
        Student st=new Student();
        st.setId(101);
        st.setName("Parth");
        st.setCity("Junagadh");
        System.out.println(st);
        
        //creating object class of address class
        Address ad = new Address();
        ad.setStreet("street1");
        ad.setCity("Junagadh");
        ad.setIsopen(true);
        ad.setAddDate(new Date());
        ad.setX(13.13);
        
        //reading image
        FileInputStream fis = new FileInputStream("src/main/java/gmail.png");
        byte[] data=new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
        Session session = factory.openSession();
        
        Transaction tx= session.beginTransaction();
        session.save(st);
        session.save(ad);
        tx.commit();
        
        session.close();
        System.out.println("Done..");
        
    }
}
