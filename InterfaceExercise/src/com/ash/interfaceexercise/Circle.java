package com.ash.interfaceexercise;

public class Circle extends Line implements Drawable, Fillable {

	@Override
	public void fillingColor() {
		System.out.println("filling color for circle");

	}

//	@Override
//	public void drawingColor() {
//		System.out.println("drawing color for circle");
//
//	}

	@Override
	public void size() {
		System.out.println("size of cirlce");
		
	}

//	@Override
//	public void thickness() {
//		System.out.println("thickness of circle drawing");
//	}

}
