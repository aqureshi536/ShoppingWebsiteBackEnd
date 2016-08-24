package com.ahmad.model;

import java.io.Serializable;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

@Entity
@Component
public class Customer implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String customerId;
	
	@Pattern(regexp="(^$|[0-9]{10})",message="Enter a 10 digit valid phone no")
	private String phoneNo;
	@NotBlank(message="Gender should be selected")
	private String gender;
	@NotBlank(message="Password should be filled")
	@Length(min=8,message="Password should have minimum 8 characters")
	private String password;
	@NotBlank(message="Please enter a valid email Id")
	@Email(message="Please enter a valid email Id")
	private String username;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
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

	
	
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Customer(){
		this.customerId="CUST"+UUID.randomUUID().toString().substring(24).toUpperCase();
	}

}
