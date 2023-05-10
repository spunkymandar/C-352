package com.beans;

public class Address {
	
	private String buildingName;
	private String streetName;
	private String cityName;
	private String countryName;
	@Override
	public String toString() {
		return "Address [buildingName=" + buildingName + ", streetName=" + streetName + ", cityName=" + cityName + "]";
	}
	public Address(String buildingName, String streetName, String cityName,String countryName) {
		super();
		this.buildingName = buildingName;
		this.streetName = streetName;
		this.cityName = cityName;
		this.countryName=countryName;
	}
	
	
	public Address() {
		
	}

}
