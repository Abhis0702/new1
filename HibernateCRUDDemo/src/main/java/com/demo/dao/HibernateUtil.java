package com.demo.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	static SessionFactory sf;
	static SessionFactory getmyConnection() {
		if(sf==null) {
			sf=new Configuration().configure().buildSessionFactory();
		}
		return sf;
	}
	
	static void closeMyConnection() {
		if(sf!=null) {
			sf.close();
		}
		
	}

}
