package com.ahmad.model;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotBlank;
import org.springframework.stereotype.Component;

@Entity
@Component
public class BillingAddress {
	@Id
	private String billingAddressId;
	private String customerId;
	@NotBlank
	private String line1;
	@NotBlank
	private String city;
	@NotBlank
	private String state;
	@NotBlank
	private String country;
	@NotBlank
	private String zipCode;

	public String getBillingAddressId() {
		return billingAddressId;
	}

	public void setBillingAddressId(String billingAddressId) {
		this.billingAddressId = billingAddressId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	public BillingAddress()
	{
		this.billingAddressId=UUID.randomUUID().toString().substring(24).toUpperCase();
	}

}