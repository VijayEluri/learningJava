package com.finals;

public class TShirt {

	private String color;
	
	public static final int SMALL =0;
	public static final int MEDIUM =1;
	public static final int LARGE =2;
	
	private final double basePrice;
	private int size;
	
	public TShirt(String color, int size) {
		this.size = size;
		this.color = color;
		basePrice = 23.23;
	}
	
	public double getPrice(){
		double coef =0;
		
		if(size==0){
			coef = 1;
		}else if(size==1){
			coef =1.5;
		}else{
			coef =2;
		}
		
		return coef * basePrice;
	}
	
}
