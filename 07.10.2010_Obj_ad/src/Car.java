
public class Car {
	
	String color = "red";
	int capacity = 5;
	int maxSpeed = 200;
	double price = 43600;
	double avgConsumption = 7;
	
	boolean engineRunning = false;
	int currentSpeed = 0;
	
	//constructor aþaðýda, overwrite
	
	/*public Car(){
		color = "blue";
		capacity = 2;
		
		*/
	
	
	/*public Car(String col,int cap){
	color = "col";
	capacity = cap;
	
	
	bunda tanýmlama yapmak lazýmmm
	*/

	}
	
	
	public void startEngine(){
		if(!engineRunning){
			engineRunning = true;
		}
		
		
		
	}
	
	public void increaseSpeed(int increaseVal){
		currentSpeed +=increaseVal;
		System.out.println("speed increased to" + currentSpeed);
	}
	
	public void decreaseSpeed( int decreaseVal){
		currentSpeed -=decreaseVal;
		System.out.println("speed decreased to" + currentSpeed);
		
	}
	
	public void stopEngine (){
		if(engineRunning){
			engineRunning = false;
			System.out.println("engine stopped");
		}
	}

}