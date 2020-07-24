package com.Biditvats.spring.bean;

import org.springframework.stereotype.Component;

@Component("user")
public class User {
	private String userName;
	private String gender;
	private String[] hobbies;
	private String[] skills;
	private String password;
	private String address;
	
	public User() {
		System.out.println("User object is created");
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String[] getHobbies() {
		return hobbies;
	}

	public void setHobbies(String[] hobbies) {
		this.hobbies = hobbies;
	}

	public String[] getSkills() {
		return skills;
	}

	public void setSkills(String[] skills) {
		this.skills = skills;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}
