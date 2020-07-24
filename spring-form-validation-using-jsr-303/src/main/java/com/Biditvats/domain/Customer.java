package com.Biditvats.domain;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

public class Customer {
	private long id;
	
	@NotEmpty(message = "First Name Can't be empty!")
	@Size(min = 5, message = "First Name Length must be min 5")
	private String firstName;
	@NotEmpty(message = "Last name Can't be empty!")
	private String lastName;
	
	@NotEmpty(message = "Email can't be empty!")
	@Email(message = "Invalid Email ID")
	private String email;
	
	@NotEmpty(message = "Mobile Field Can't be empty!")
	@Pattern(regexp = "(^[789]\\d{9})", message ="Invalid Mobile Number")
	private String mobile;
	
	@NotEmpty(message = "Gender Can't be empty!")
	private String gender;
	
	@NotEmpty(message = "Password Can't be empty!")
	@Size(min=5 , max=10, message="Password Length must be 5 to 10")
	private String password;
	
	public Customer() {
		//Do Nothing
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
