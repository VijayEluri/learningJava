package com.statics;

public class Bus {

	private String destination;
	private String from;
	private double price;
	
	public static int count;
	
	public Bus() {
		// TODO Auto-generated constructor stub
	}
	
	public Bus(String destination, String from, double price) {
		super();
		this.destination = destination;
		this.from = from;
		this.price = price;
		count++;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	
}
