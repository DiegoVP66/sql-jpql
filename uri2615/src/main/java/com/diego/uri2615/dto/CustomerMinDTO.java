package com.diego.uri2615.dto;

import java.io.Serializable;

import com.diego.uri2615.projections.CustomerMinProjection;

public class CustomerMinDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String city;

	public CustomerMinDTO() {
	}

	public CustomerMinDTO(String city) {
		this.city = city;
	}

	public CustomerMinDTO(CustomerMinProjection obj) {
		city = obj.getCity();
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "CustomerMinDTO [city=" + city + "]";
	}

}
