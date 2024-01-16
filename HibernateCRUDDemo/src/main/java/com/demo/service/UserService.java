package com.demo.service;

import java.util.List;

import com.demo.model.MyUser;

public interface UserService {

	void addNewUser();

	List<MyUser> GetAll();

	List<MyUser> sortbyid();

	MyUser getById(int id);

	boolean deleteById(int id);

	boolean updateById(int id, String uname, String str);

	void closeMySession();

}
