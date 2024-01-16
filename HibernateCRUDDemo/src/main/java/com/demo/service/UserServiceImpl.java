package com.demo.service;

import java.util.List;
import java.util.Scanner;

import com.demo.dao.UserDao;
import com.demo.dao.UserDaoImpl;
import com.demo.model.Address;
import com.demo.model.MyUser;

public class UserServiceImpl implements UserService {
	private UserDao udao;
	
	public UserServiceImpl() {
		udao=new UserDaoImpl();
	}

	@Override
	public void addNewUser() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter User Id: ");
		int id=sc.nextInt();
		System.out.println("Enter User Name: ");
		String name=sc.next();
		System.out.println("Enter Address Id: ");
		int addrid=sc.nextInt();
		System.out.println("Enter Street: ");
		String street=sc.next();
		System.out.println("Enter City: ");
		String city=sc.next();
		MyUser u=new MyUser(id,name,new Address(addrid,street,city));
		udao.save(u);
	}

	@Override
	public List<MyUser> GetAll() {
		return udao.fetchAll();
	}

	@Override
	public List<MyUser> sortbyid() {
		return udao.sortById();
	}

	@Override
	public MyUser getById(int id) {
		return udao.displayById(id);
	}

	@Override
	public boolean deleteById(int id) {
		return udao.deletbyid(id);
	}

	@Override
	public boolean updateById(int id, String uname, String str) {
		return udao.modifyById(id, uname, str);
	}

	@Override
	public void closeMySession() {
		udao.closeMySessionFact();
		
	}

}
