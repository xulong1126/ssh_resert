package com.xu.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class User {

	private Integer id;
	
	private String username;
	
	private String password;
	
	private Integer sex;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date birthday;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getSex() {
		return sex;
	}

	public void setSex(Integer sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", sex=" + sex + ", birthday="
				+ birthday + "]";
	}
	
	
}
