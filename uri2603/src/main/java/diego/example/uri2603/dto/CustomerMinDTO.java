package diego.example.uri2603.dto;

import java.io.Serializable;

import diego.example.uri2603.projections.CustomerMinProjection;

public class CustomerMinDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private String name;
	private String street;

	public CustomerMinDTO() {
	}

	public CustomerMinDTO(String name, String street) {
		this.name = name;
		this.street = street;
	}

	public CustomerMinDTO(CustomerMinProjection obj) {
		name = obj.getName();
		street = obj.getStreet();
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

	@Override
	public String toString() {
		return "CustomerMinDTO [name=" + name + ", street=" + street + "]";
	}

}
