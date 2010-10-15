package com.composition2;

public class MainClass {

	public static void main(String[] args) {
		
		Door d = new Door("Wood", "Brown");
		Window win1 = new Window("Wooden");
		Window win2 = new Window("Plastic");
		
		Wall w1 = new Wall("Blue");
		Wall w2 = new Wall("Gray");
		Wall w3 = new Wall("Yellow");
		Wall w4 = new Wall("Red");
		
		Floor firstFloor = 
			new Floor(d, new Window[]{win1,win2}, 
					new Wall[]{w1,w2,w3,w4});
		
		Floor secFloor = 
			new Floor(d, new Window[]{win1,win2}, 
					new Wall[]{w1,w2,w3,w4});
		
		
		HOuse h = new HOuse(new Floor[]{firstFloor, secFloor});
		
		System.out.println("The house has " + h.getFloors().length +" floors");
	
		for (Floor floor : h.getFloors()) {
			System.out.println(floor.getWalls()[1].getColor());
			
		}
	}
	
}
