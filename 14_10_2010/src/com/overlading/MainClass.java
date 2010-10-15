package com.overlading;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		
		Rectangle r = new Rectangle(23,23);
		Circle c = new Circle(12);
		
		Pen pen = new Pen();
		pen.draw(r);
		pen.draw(c);
		
	
		
		
	}
	
}
