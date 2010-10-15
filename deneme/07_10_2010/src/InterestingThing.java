
public class InterestingThing {

	public static void main(String[] args) {
		
		long l = 100000000000L;
		
		byte b1 = 12;
		byte b2 = 23;
		
		//Wrong:
		//byte sumByte = b1 + b2;
		
		byte sumByte = (byte)(b1 + b2);
		
	}
	
	
}
