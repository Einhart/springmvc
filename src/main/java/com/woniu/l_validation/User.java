package com.woniu.l_validation;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User implements Serializable {
	@Prime(min = 10, max = 100, message = "必须为质数", groups = B.class)
	private Integer uid;
	@Size(min = 2, max = 4, message = "{validation.name.size}", groups = A.class)
	@Size(min = 3, max = 5, message = "{validation.name.size}", groups = B.class)
	private String uname;
	private Date birthday;
	private Double money;
	@Pattern(regexp = "1[358]\\d{9}", message = "请输入正确的手机")
	private String cellphone;
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
	public Double getMoney() {
		return money;
	}
	public void setMoney(Double money) {
		this.money = money;
	}
	public String getCellphone() {
		return cellphone;
	}
	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", birthday=" + birthday + ", money=" + money + ", cellphone="
				+ cellphone + "]";
	}
}
