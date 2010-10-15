package com.composition2;

public class HOuse {

	private  Floor[] floors;

	public HOuse(Floor[] floors) {
		super();
		this.floors = floors;
	}

	public Floor[] getFloors() {
		return floors;
	}

	public void setFloors(Floor[] floors) {
		this.floors = floors;
	}
	
	
}
