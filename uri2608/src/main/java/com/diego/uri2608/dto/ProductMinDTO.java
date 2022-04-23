package com.diego.uri2608.dto;

import java.io.Serializable;

import com.diego.uri2608.projections.ProductMinProjection;

public class ProductMinDTO implements Serializable {

	private static final long serialVersionUID = 1L;
	private Double price;

	public ProductMinDTO() {
	}

	public ProductMinDTO(Double price) {
		this.price = price;
	}

	public ProductMinDTO(ProductMinProjection obj) {
		price = obj.getPrice();
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductMinDTO [price=" + price + "]";
	}

}
