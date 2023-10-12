package com.tut.springlifecycle;

public class PC {
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public PC() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "PC [price=" + price + "]";
	}
	
	public void init() {
		System.out.println("Inside init method");
	}
	
	public void destroy() {
		System.out.println("Inside destroy method");
	}
	
}
