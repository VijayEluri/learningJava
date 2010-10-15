package com.interesting;

public class MainClass {

	public static void main(String[] args) {
		Person p1 = new Person("altug",30);
		Person p2 = new Person("ahmet",32);
		
		PersonManager pm = new PersonManager();
		
		System.out.println("P1 name:" + p1.getName());
		
		pm.changePersonName(p1, "haydar");
		
		System.out.println("P1 name:" + p1.getName());
		
		
		int x = 12;
		//code below do not change anything
		changeValue(x);
		System.out.println("x:" + x);
		
		//code below changes value for x
		x = changeValueForSure(x);
		
		
		
	}
	
	
	public static void changeValue(int x){
		
		x = 34;
		
	}
	
	public static int changeValueForSure(int x){
		return x+23;
	}
	

	
}
