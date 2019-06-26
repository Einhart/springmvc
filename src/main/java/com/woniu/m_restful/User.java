package com.woniu.m_restful;

import java.io.Serializable;

public class User implements Serializable {
	private Integer uid;
	private String uname;
	private Double money;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", money=" + money + "]";
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(Integer uid, String uname, Double money) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.money = money;
	}
}
