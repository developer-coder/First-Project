package com.example.demo;

import java.util.Date;

public class User {
	
	private String name;
	private String email;
	private String password;
	private String gender;
	private String note;
	private String profession;
	private Date birthday;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public User(String name, String email, String password, String gender, String note, String profession,
			Date birthday, boolean married) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.note = note;
		this.profession = profession;
		this.birthday = birthday;
		this.married = married;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", password=" + password + ", gender=" + gender + ", note="
				+ note + ", profession=" + profession + ", birthday=" + birthday + ", married=" + married + "]";
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	private boolean married;

}
