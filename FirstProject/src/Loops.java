import java.util.Scanner;


public class Loops {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int x = 0;
		
		while(x<100){
			System.out.println(x++);
			System.out.println(x<100);
		}
		
		for (int i = 0; i < 100; i++) {
			
		}
		
		System.out.println("0-main menu, 1-articles,2-writers");
		
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		
		// byte,short,int or char
		
		switch (number) {
		case 0:
			System.out.println("you go to the main menu");
			
			break;
		case 1:
			System.out.println("you go to the articles");
			
			break;
		case 2:
			System.out.println("you go to the writers");
			
			break;

		default:
			break;
		}

	}

}
