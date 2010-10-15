
public class BreakContinue {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int count = 0;
		
		while(count<30){
			if(count==15)break;
			
			System.out.println(count);
			count++;
		}
		System.out.println("out of while");
		
		while(count<30){
			count++;
			if(count==17)continue;
			System.out.println(count);
		
		}
		
		System.out.println("out of while");
}
}
