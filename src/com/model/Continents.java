package com.model;

public class Continents {
	
	private String continentName;
	private String countriesInIt;
	
	public Continents(String continentName, String countriesInIt) {
		super();
		this.continentName = continentName;
		this.countriesInIt = countriesInIt;
	}

	public String getContinentName() {
		return continentName;
	}

	public void setContinentName(String continentName) {
		this.continentName = continentName;
	}

	public String getCountriesInIt() {
		return countriesInIt;
	}

	public void setCountriesInIt(String countriesInIt) {
		this.countriesInIt = countriesInIt;
	}
	
}
