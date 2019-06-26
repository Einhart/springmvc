package com.woniu.g_httpmessageconverter.b;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
	private Integer uid;
	private String uname;
	private Date birthday;
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
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", birthday=" + birthday + "]";
	}
}
