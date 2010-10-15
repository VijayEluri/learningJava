package com.overlading;

public class Pen {

	
	public void draw(Rectangle r){
		System.out.println((r.getWidth() + r.getHeight())*2);
	}
	
	//Overloading
	public void draw(Circle c){
		System.out.println(2 * c.getRadius()*Math.PI);

	}
	
}
