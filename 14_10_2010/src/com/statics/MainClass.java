package com.statics;

public class MainClass {


	
	public static void main(String[] args) {
		int sum = Calculator.makeSum(12,34,2321);
		System.out.println(Calculator.PI);

	
		Bus b1 = new Bus("Istanbul", "Ankara", 55.5);
		Bus b2 = new Bus("Istanbul", "Ankara", 55.5);
		Bus b3 = new Bus("Istanbul", "Ankara", 55.5);
		Bus b4 = new Bus("Istanbul", "Ankara", 55.5);
		Bus b5 = new Bus("Istanbul", "Ankara", 55.5);
		Bus b6 = new Bus("Istanbul", "Ankara", 55.5);
		
		System.out.println(Bus.count);
		
		MySingleton sing = MySingleton.getInstance();
		
		sing.setName("altug");
		
		MySingleton sing2 = MySingleton.getInstance();
		System.out.println(sing2.getName());
		
	}

	
}
