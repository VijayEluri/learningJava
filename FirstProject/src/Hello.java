import java.util.Scanner;


public class Hello {
	
	public static void main(String[] args) {
		
		//This is a comment
		
		/*Bu kodu kapatir*/
		
		
		int myNumber=5;
		
		double myDecimal =5.5;
		
		int solution = (5+5)*12/24;
		
		int number = 122;
		
		number = number+25;
		
		number+= 25;
		
		
		int x = 25;
		
		System.out.println(x);
		
		int y = x++;
		
		System.out.println("y : "+y);
		System.out.println("x : "+x);
		
		int z = ++x;
		System.out.println("x :"+ x);
		System.out.println("z :"+ z);
		
		String myString = "Welcome";
		myString += " to class";
		
		System.out.println(myString);
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("please enter your name ");
	
		String name = input.next();
		
		System.out.println(name);
		
		
		
		
	}
	
}
