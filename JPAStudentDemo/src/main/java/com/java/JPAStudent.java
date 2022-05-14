package com.java;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class JPAStudent {
	@Id
	private int sid;
	private String sname;
	private String scourse;
	//getter and setter
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getScourse() {
		return scourse;
	}
	public void setScourse(String scourse) {
		this.scourse = scourse;
	}
	
	//String to String
	@Override
	public String toString() {
		return "JPAStudent [sid=" + sid + ", sname=" + sname + ", scourse=" + scourse + "]";
	}
	
	
	
	
	

}
