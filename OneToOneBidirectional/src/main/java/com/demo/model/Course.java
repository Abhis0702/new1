package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Course11")
public class Course {
	@Id
	private int cid;
	private String cname;
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fid")
	private Faculty f;
	public Course() {
		super();
	}
	public Course(int cid, String cname, Faculty f) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.f = f;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Faculty getF() {
		return f;
	}
	public void setF(Faculty f) {
		this.f = f;
	}
	@Override
	public String toString() {
		return "Course [cid=" + cid + ", cname=" + cname +  "]";
	}
	
}
