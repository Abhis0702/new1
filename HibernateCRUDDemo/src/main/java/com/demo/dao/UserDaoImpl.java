package com.demo.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.demo.model.MyUser;

public class UserDaoImpl implements UserDao{
	
	static SessionFactory sf;
	static {
		sf=HibernateUtil.getmyConnection();
	}
	
	@Override
	public void save(MyUser u) {
		Session session=sf.openSession();
		Transaction tr= session.beginTransaction();
		session.save(u);
		tr.commit();
		session.close();
		
		
	}

	@Override
	public List<MyUser> fetchAll() {
		
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		Query query = session.createQuery("from MyUser");
		List<MyUser> ulist = query.list();
		tr.commit();
		session.close();
		return ulist;
	}

	@Override
	public List<MyUser> sortById() {
		Session session = sf.openSession();
		Transaction tr= session.beginTransaction();
		Query query=session.createQuery("from MyUser u order by u.id desc");
		List<MyUser> ulist=query.list();
		tr.commit();
		session.close();
		return ulist;
	}

	@Override
	public MyUser displayById(int id) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		MyUser user = session.get(MyUser.class, id);
		tr.commit();
		session.close();
		return user;
	}

	@Override
	public boolean deletbyid(int id) {
		Session session =sf.openSession();
		Transaction tr= session.beginTransaction();
		MyUser u=session.get(MyUser.class, id);
		if(u!=null) {
			session.delete(u);
			tr.commit();
			session.close();
			return true;
		}
		session.close();
		return false;
	}

	@Override
	public boolean modifyById(int id, String uname, String str) {
		Session session = sf.openSession();
		Transaction tr = session.beginTransaction();
		MyUser u = session.get(MyUser.class, id);
		if(u != null) {
			u.setUname(uname);
			u.getAddr().setStreet(str);
			tr.commit();
			session.close();
			return true;
		}
		tr.commit();
		session.close();
		return false;
	}

	@Override
	public void closeMySessionFact() {
		HibernateUtil.closeMyConnection();
		
	} 

}
