
public class MainClass {

	
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		//object is created , keeping a space in memory
		
		System.out.println("Color: " +myCar.color);
		System.out.println("max speed: " +myCar.maxSpeed);
		System.out.println("capacity: " +myCar.capacity);
		
		myCar.startEngine();
		myCar.increaseSpeed(30);
		myCar.increaseSpeed(30);
		myCar.increaseSpeed(60);
		
		myCar.decreaseSpeed(30);
		myCar.decreaseSpeed(30);
		myCar.decreaseSpeed(60);
		myCar.stopEngine();
		
		
		
	}

}
