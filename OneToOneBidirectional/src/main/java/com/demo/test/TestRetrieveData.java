package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Course;
import com.demo.model.Faculty;

public class TestRetrieveData {

	public static void main(String[] args) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Faculty f = session.get(Faculty.class, 10);
		//Course c3 = session.get(Course.class, 1);
		System.out.println("Before");
		System.out.println(f);
		System.out.println("After");
	}

}
