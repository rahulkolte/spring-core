package com.rk;

public class Item {

	private String name;
	private double price;

	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	public String getName() {
		return name;
	}

	public Item(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}
