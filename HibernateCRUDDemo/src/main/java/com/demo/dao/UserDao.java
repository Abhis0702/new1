package com.demo.dao;

import java.util.List;

import com.demo.model.MyUser;

public interface UserDao {

	void save(MyUser u);

	List<MyUser> fetchAll();

	List<MyUser> sortById();

	MyUser displayById(int id);

	boolean deletbyid(int id);

	boolean modifyById(int id, String uname, String str);

	void closeMySessionFact();

}
