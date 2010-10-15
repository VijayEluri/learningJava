
public class Car {

	String color = "red";
	int capacity = 5;
	int maxSpeed = 200;
	double price = 43600;
	double avgConsumption = 7;
	
	boolean engineRunning = false;
	int currentSpeed = 0;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}
	
	public Car(String col, int cap){
		color = col;
		capacity = cap;
	}
	
	public void startEngine(){
	
		
		if(!engineRunning){
			engineRunning = true;
			System.out.println("Engine started");
		}
	
	}
	
	public void increaseSpeed(int increaseVal){
		currentSpeed +=increaseVal;
		System.out.println("Speed increased to " + currentSpeed);
	}
	
	public void decreaseSpeed(int decreaseVal){
		currentSpeed -=decreaseVal;
		System.out.println("Speed is decreased to " + currentSpeed);
	}
	
	public void stopEngine(){
		if(engineRunning){
			engineRunning = false;
			System.out.println("Car has stopped!");
		}
	}
	
	
	
}
