package com.ash.interfaceexercise;

public class App {

	public static void main  (String[] args) {
		
		Line line = new Line();
		Circle circle = new Circle();
		Square square = new Square();
		
		line.drawingColor();
		line.thickness();
		
		circle.drawingColor();
		circle.fillingColor();
		
		square.thickness();
		square.drawingColor();
		square.size();
		
	}
}
