package com.statics;

public class Calculator {

	public static double PI = 3.14;
	
	public static int makeSum(int... values){
		
	
		
		int sum = 0;
		for (int i : values) {
			sum+=i;
		}
		return sum;
	}
	
}
