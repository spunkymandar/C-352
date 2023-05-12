package com.anno.beans;

import org.springframework.stereotype.Component;

@Component
public class Address {
	String city;
	
	public Address() {
		city="Pune";
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	

}
