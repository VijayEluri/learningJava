package com.composition2;

public class Floor {

	private Door door;
	private Window[] windows;
	private Wall[] walls;
	public Floor(Door door, Window[] windows, Wall[] walls) {
		super();
		this.door = door;
		this.windows = windows;
		this.walls = walls;
	}
	public Door getDoor() {
		return door;
	}
	public void setDoor(Door door) {
		this.door = door;
	}
	public Window[] getWindows() {
		return windows;
	}
	public void setWindows(Window[] windows) {
		this.windows = windows;
	}
	public Wall[] getWalls() {
		return walls;
	}
	public void setWalls(Wall[] walls) {
		this.walls = walls;
	}
	
	
	
}
