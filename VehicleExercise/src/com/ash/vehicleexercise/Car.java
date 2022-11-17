package com.ash.vehicleexercise;

public class Car extends Vehicle {
	
	private String reg;
	
	public Car(String color, String model, int numWheels, String reg) {
		super(color, model, numWheels);
		this.reg = reg;
	}

	@Override
	public void drive() {
		//on road? idk
	}
	
	@Override
	public void getFined() {
		System.out.println(reg + " got fined!");
	}
	
	public void displayCarReg() {
		displayVehicle();
		System.out.println("Reg: " + reg);
	}
}
