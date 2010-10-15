
public class Branching {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		outer: 
		for (int i = 0; i < 100; i++) {
			
			System.out.println(i);
			
			for (int j = 0; j < 30; j++) {
				
				System.out.println(j);
				if(j==15) break outer;
				
			}
			
		}

	}

}
