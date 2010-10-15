package com.finals;

public class MainClass {

	public static void main(String[] args) {
		
		TShirt t1 = new TShirt("Blue", TShirt.MEDIUM);
		TShirt t2 = new TShirt("Blue", TShirt.MEDIUM);
		TShirt t3 = new TShirt("Blue", TShirt.SMALL);
		
		
		System.out.println(t1.getPrice());
		System.out.println(t2.getPrice());
		System.out.println(t3.getPrice());
	}
	
}
