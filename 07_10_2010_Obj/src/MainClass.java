
public class MainClass {

	public static void main(String[] args) {
		
		
		Car myCar = new Car();
		System.out.println("Color:" + myCar.color);
		System.out.println("Max Speed:" + myCar.maxSpeed);
		System.out.println("Capacity:" + myCar.capacity);

		
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
