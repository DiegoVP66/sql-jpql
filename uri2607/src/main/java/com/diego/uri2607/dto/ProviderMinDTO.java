package com.diego.uri2607.dto;

import java.io.Serializable;

import com.diego.uri2607.projections.ProviderMinProjection;

public class ProviderMinDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String city;

	public ProviderMinDTO() {
	}

	public ProviderMinDTO(String city) {
		this.city = city;
	}

	public ProviderMinDTO(ProviderMinProjection obj) {
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
		return "ProviderMinDTO [city=" + city + "]";
	}

}
