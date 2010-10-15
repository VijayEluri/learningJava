import java.util.Scanner;


public class GradeCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int count =0;
		int sum =0;
		
		while(true){
			
			System.out.println("Please enter the grade of student " + (count+1));
			int grade = sc.nextInt();
			if(grade==101) break;
			sum+=grade;// sum = sum + grade;
			count++;
		}
		if(count==0) {
			System.out.println("No students");
			return;
		}
		System.out.println("NUmber of students:" + count);
		System.out.println("Avarage is " + (sum/count));
		
	}
	
}
