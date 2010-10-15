
public class Array14Ekim {

	public static void main(String[]args){
		
		int[] myIntegerArray = {12,13,67};
		
		int[] myIntegerArray2 = new int [2];
		
		myIntegerArray2[0]= 23;
		myIntegerArray2[1]= 45;
		
		for (int i =0; i< myIntegerArray.length;i++) {
			
			System.out.println(myIntegerArray[i]);
		}
		
		for (int i: myIntegerArray2){
			System.out.println(i);
		}
		
		
	}
}
