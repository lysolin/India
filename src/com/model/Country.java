package com.model;

public class Country {

	private String countryName;
	private String countryCapitalCity;
	
	public Country(String countryName, String countryCapitalCity) {
		super();
		this.countryName = countryName;
		this.countryCapitalCity = countryCapitalCity;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryCapitalCity() {
		return countryCapitalCity;
	}

	public void setCountryCapitalCity(String countryCapitalCity) {
		this.countryCapitalCity = countryCapitalCity;
	}	
}
