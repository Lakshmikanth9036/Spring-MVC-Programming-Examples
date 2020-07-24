package com.Biditvats.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="CUSTOMER_MASTER")
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
	
	@NotEmpty(message = "Password Can't be empty!")
	@Size(min=5 , max=10, message="Password Length must be 5 to 10")
	private String password;
	
	public Customer() {
		//Do Nothing
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="CUSTOMER_ID")
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	@Column(name="FIRST_NAME")
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name="LAST_NAME")
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name="EMAIL")
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Column(name="MOBILE")
	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	@Column(name="PASSWORD")
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
