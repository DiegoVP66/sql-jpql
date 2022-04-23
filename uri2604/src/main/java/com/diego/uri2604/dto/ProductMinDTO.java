package com.diego.uri2604.dto;

import java.io.Serializable;

import com.diego.uri2604.projections.ProductMinProjection;

public class ProductMinDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String name;

	public ProductMinDTO() {
	}

	public ProductMinDTO(Long id, String name) {
		this.id = id;
		this.name = name;
	}

	public ProductMinDTO(ProductMinProjection obj) {
		this.id = obj.getId();
		this.name = obj.getName();
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

	@Override
	public String toString() {
		return "ProductMinDTO [id=" + id + ", name=" + name + "]";
	}

}
