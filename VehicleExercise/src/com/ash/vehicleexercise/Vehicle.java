package com.ash.vehicleexercise;

public class Vehicle {

	private String color, model;
	private int numWheels;
	
	public Vehicle(String color, String  model, int numWheels) {
		this.color = color;
		this.model = model;
		this.numWheels = numWheels;
	}
	
	
	
	public String getColor() {
		return color;
	}



	public void setColor(String color) {
		this.color = color;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public int getNumWheels() {
		return numWheels;
	}



	public void setNumWheels(int numWheels) {
		this.numWheels = numWheels;
	}



	public void drive() {
		System.out.println("Driving now");
	}
	
	public void getFined() {
		System.out.println("Got fined!");
	}
	
	public void displayVehicle() {
		
	}
	
}
