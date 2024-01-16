package com.demo.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="MyUser")
public class MyUser {
	@Id
	private int id;
	private String uname;
	@Embedded
	private Address addr;
	public MyUser() {
		super();
	}
	public MyUser(int id, String uname, Address addr) {
		super();
		this.id = id;
		this.uname = uname;
		this.addr = addr;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
		return "MyUser [id=" + id + ", uname=" + uname + ", addr=" + addr + "]";
	}
	

}
