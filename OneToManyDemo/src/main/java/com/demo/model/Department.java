package com.demo.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="DeptTab21")
public class Department {
	@Id
	private int dno;
	private String dname;
	private String dloc;
	@OneToMany (mappedBy="dept", cascade= CascadeType.ALL)
	private Set<Employee> eset;
	public Department() {
		super();
	}
	public Department(int dno, String dname, String dloc) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.dloc = dloc;
	}
	public Department(int dno, String dname, String dloc, Set<Employee> eset) {
		super();
		this.dno = dno;
		this.dname = dname;
		this.dloc = dloc;
		this.eset = eset;
	}
	
	public int getDno() {
		return dno;
	}
	public void setDno(int dno) {
		this.dno = dno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getDloc() {
		return dloc;
	}
	public void setDloc(String dloc) {
		this.dloc = dloc;
	}
	public Set<Employee> getEset() {
		return eset;
	}
	public void setEset(Set<Employee> eset) {
		this.eset = eset;
	}
	@Override
	public String toString() {
		return "Department [dno=" + dno + ", dname=" + dname + ", dloc=" + dloc + "]";
	}
	
	

}
