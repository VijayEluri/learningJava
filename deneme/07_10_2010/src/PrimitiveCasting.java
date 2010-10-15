
public class PrimitiveCasting {

	public static void main(String[] args) {
		
		
		int num1 = 10;
		int num2 = 1000;
		
		long num3 = num1 + num2;
		
		long l1 = 100000;
		long l2 = 1000000;
		int sumlong = (int)(l1 + l2);
		
		
		double d1 = 1.345;
		double d2 = 1.23;
		
		int sumDouble = (int)(d1+d2);
		System.out.println("Double sum:" + sumDouble);
	}
	
}
