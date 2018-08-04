package com.cg.basiccollection.classes;

//declaring variables used in CellPhone class
public class CellPhone {
	private String company;
	private String model;
	private String description;
	private String operatingSystem;
	double price;

	// creating a constructor for CellPhone class
	public CellPhone(String name, String model, String desc, String os, double price) {
		this.company = name;
		this.model = model;
		this.description = desc;
		this.operatingSystem = os;
		this.price = price;
	}

	@Override
	public String toString() {
		return "CellPhone with company = " + company + ", model = " + model + ", description = " + description
				+ ", operatingSystem = " + operatingSystem + ", price = " + price + ".";
	}

}
