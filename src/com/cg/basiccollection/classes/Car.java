package com.cg.basiccollection.classes;

//declaring the variables used in Car class
public class Car {
	private String make;
	private String model;
	private int year;
	private double price;

	// creating a constructor for Car class
	public Car(String make, String model, int year, double price) {
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car with make = " + make + ", model = " + model + ", year = " + year + ", price = " + price + ".";
	}

}
