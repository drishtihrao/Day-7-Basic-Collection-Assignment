package com.cg.basiccollection.classes;

//creating a class laptop and declaring the variables
public class Laptop {
	private String companyName;
	private String model;
	private String operatingSystem;
	private String processor;

	// creating a constructor for Laptop class
	public Laptop(String name, String model, String os, String processor) {
		this.companyName = name;
		this.model = model;
		this.operatingSystem = os;
		this.processor = processor;
	}

	@Override
	public String toString() {
		return "Laptop with companyName = " + companyName + ", model = " + model + ", operatingSystem = "
				+ operatingSystem + ", processor = " + processor + ".";
	}

}
