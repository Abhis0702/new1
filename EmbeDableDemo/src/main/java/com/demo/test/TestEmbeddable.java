package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.model.Address;
import com.demo.model.MyUser;

public class TestEmbeddable {

	public static void main(String[] args) {
		Address ad1 = new Address(1, "Gokhalenagar", "Pune");
		Address ad2 = new Address(2, "NilJyoti", "Pune");
		MyUser u1 = new MyUser(10, "Abhishek", ad1);
		MyUser u2 = new MyUser(11, "Varad", ad2);
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		session.save(u1);
		session.save(u2);
		tr.commit();
		sf.close();
	}
}
