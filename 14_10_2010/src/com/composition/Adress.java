package com.composition;

public class Adress {

	private String city;
	private String street;
	private String postalCode;
	
	public Adress() {
		// TODO Auto-generated constructor stub
	}

	public Adress(String city, String street, String postalCode) {
		super();
		this.city = city;
		this.street = street;
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
}
