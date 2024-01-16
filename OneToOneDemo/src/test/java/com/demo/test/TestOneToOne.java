package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.MyUser;

public class TestOneToOne {

	public static void main(String[] args) {
		Address ad1=new Address(3,"SB Road","Pune");
		Address ad2=new Address(4,"Deccan","Pune");
		MyUser m1=new MyUser(3,"Arjun",ad1);
		MyUser m2=new MyUser(4,"Pranav",ad2);
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session  session=sf.openSession();
		Transaction tr=session.beginTransaction();
		session.save(ad1);
		session.save(ad2);
		session.save(m1);
		session.save(m2);
		tr.commit();

	}

}
