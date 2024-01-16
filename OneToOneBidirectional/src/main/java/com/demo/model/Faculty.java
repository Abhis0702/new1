package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Faculty12")
public class Faculty {
	@Id
	private int fid;
	private String fname;
	@OneToOne //(mappedBy="f")
	private Course c;
	public Faculty() {
		super();
	}
	public Faculty(int fid, String fname) {
		super();
		this.fid = fid;
		this.fname = fname;
	}

	public Faculty(int fid, String fname, Course c) {
		super();
		this.fid = fid;
		this.fname = fname;
		this.c = c;
	}
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public Course getC() {
		return c;
	}
	public void setC(Course c) {
		this.c = c;
	}
	@Override
	public String toString() {
		return "Faculty [fid=" + fid + ", fname=" + fname + ", c=" + c + "]";
	}
	
}
