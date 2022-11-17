package com.ash.interfaceexercise;

public class Line implements Drawable {
	
	private String thickness;

	@Override
	public void drawingColor() {
		System.out.println("drawing color for line");

	}

	@Override
	public void thickness() {
		System.out.println("thickness of line");
		
	}

}
