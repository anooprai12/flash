package com.jpa.component;

import org.springframework.stereotype.Component;

@Component
public class CountryComponent 
{
	private String countryCode;
	private String countryName;
	private String stateName;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@Override
	public String toString() {
		return "CountryComponent [countryCode=" + countryCode + ", countryName=" + countryName + ", stateName="
				+ stateName + "]";
	}

}
