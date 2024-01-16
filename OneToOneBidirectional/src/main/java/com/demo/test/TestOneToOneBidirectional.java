package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Course;
import com.demo.model.Faculty;

public class TestOneToOneBidirectional {

	public static void main(String[] args) {
		
		Faculty f1 = new Faculty(10, "Kishori Khadilkar");
		Faculty f2 = new Faculty(11, "Tambade sir");
		
		Course c1 = new Course();
		c1.setCid(1);
		c1.setCname("Adv-Java");
		c1.setF(f1);
		Course c2 = new Course(2, "DotNet", f2);
		
		f1.setC(c1);
		f2.setC(c2);
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(f1);
		session.save(f2);
		session.save(c1);
		session.save(c2);
		tr.commit();
		sf.close();
	}

}
