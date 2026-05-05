package com.vcube.sbapp02.model;

import org.springframework.stereotype.Component;

public class Car {

	private String model;
	private String brand;
	private double price;
	private String color;
	

	public Car(String model, String brand, double price, String color) {
		super();
		this.model = model;
		this.brand = brand;
		this.price = price;
		this.color = color;
	}


	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}
}

	
