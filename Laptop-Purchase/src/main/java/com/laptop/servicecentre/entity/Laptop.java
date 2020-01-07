package com.laptop.servicecentre.entity;

public class Laptop {
	
	private String model;
	private String company;
	private float price;

	public Laptop() {
		
	}
	
	public Laptop(String model, String company, float price) {
		super();
		this.model = model;
		this.company = company;
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
}
