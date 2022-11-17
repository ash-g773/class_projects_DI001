package com.ash.interfaceexercise;

public class Square extends Line implements Drawable, Fillable {

	@Override
	public void fillingColor() {
		System.out.println("filling color for square");

	}

//	@Override
//	public void drawingColor() {
//		System.out.println("drawing color for square");
//
//	}

	@Override
	public void size() {
		System.out.println("size of square");
		
	}

//	@Override
//	public void thickness() {
//		System.out.println("thickness of square drawing");
//		
//	}

}
