package com.cg.basiccollection.classes;

//declaring the variable in Television class
public class Television {
	private String company;
	private String type;
	private boolean threeDEnabled;
	private double price;

	// creating a constructor for Television class
	public Television(String comp, String type, boolean threeD, double price) {
		this.company = comp;
		this.type = type;
		this.threeDEnabled = threeD;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Television with company = " + company + ", type = " + type + ", threeDEnabled = " + threeDEnabled
				+ ", price = " + price + ".";
	}

}
