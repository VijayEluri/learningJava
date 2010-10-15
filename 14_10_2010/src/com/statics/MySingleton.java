package com.statics;

public class MySingleton {

	private static MySingleton instance;
	
	private String name;
	
	private MySingleton(){
		
	}
	
	public static MySingleton getInstance(){
		if(instance == null)
			instance = new MySingleton();
		return instance;
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
