import java.util.Scanner;


public class Grade {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = 0;
		int answer = 0;
		int sum = 0;
		
		do{
			number++;
			
		System.out.printf("please enter the grade of student %s ?",number);
		answer = sc.nextInt();
		sum+=answer;	
		}
		
		while (answer<=100);
		
		if(answer>100){
			System.out.println();
			System.out.println("the number of student is "+(number-1));
			System.out.println("the average is "+answer/(number-1));
		}
		
		
		
		

	}

}
