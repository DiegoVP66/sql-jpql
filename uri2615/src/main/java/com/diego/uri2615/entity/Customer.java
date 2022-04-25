package com.diego.uri2615.entity;

import java.io.Serializable;
import java.util.Objects;

public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;
	private String street;
	private String city;

	public Customer() {
	}

	public Customer(Long id, String name, String street, String city) {
		this.id = id;
		this.name = name;
		this.street = street;
		this.city = city;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", street=" + street + ", city=" + city + "]";
	}

}
