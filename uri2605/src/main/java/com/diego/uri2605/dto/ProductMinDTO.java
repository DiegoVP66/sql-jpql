package com.diego.uri2605.dto;

import java.io.Serializable;

import com.diego.uri2605.projections.ProductMinProjection;

public class ProductMinDTO implements Serializable{

	private static final long serialVersionUID = 1L;

	private String name;

	private String pname;

	public ProductMinDTO() {
	}

	public ProductMinDTO(String name, String pname) {
		this.name = name;
		this.pname = pname;
	}

	public ProductMinDTO(ProductMinProjection obj) {
		name = obj.getName();
		pname = obj.getPName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public String toString() {
		return "ProductMinDTO [name=" + name + ", pname=" + pname + "]";
	}

}
