package com.capg.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity
public class Products {

	
	private String prodName;
	@Id
	private int prodId;
	private double prodPrice;
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	@Override
	public String toString() {
		return "Products [prodName=" + prodName + ", prodId=" + prodId + ", prodPrice=" + prodPrice + "]";
	}
	
}
