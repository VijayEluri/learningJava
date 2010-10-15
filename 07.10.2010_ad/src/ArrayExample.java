import java.util.Scanner;


public class ArrayExample {

	
	public static void main(String[] args) {
	
		//definning arrays: 
		
		/*int[] myIntegerArray = {12,34,21,45,23};
		
		int[]myIntegerArray2 = new int[4];
		
		myIntegerArray2[0]=13;
		myIntegerArray2[1]=25;
		myIntegerArray2[2]=34;
		myIntegerArray2[3]=42;
		
		//index out of bound exception
		
		for (int i=0 ;i< myIntegerArray2.length;i++) {
			System.out.println(myIntegerArray2[i]);
		}
		
		System.out.println();
		//foreach loop
		
		for (int i : myIntegerArray) {
			System.out.println(i);
			
		}
		//for(int[])  eðer array iki dimensional olursa
		
		
		// two dimensional array two pairs of corner paranthesis
		
		
		*/
		
		String[][]districts = new String[3][];
		
		//districts[0][0]= "besiktas"	;
		
		//0- istanbul, 1-izmir,2-ankara
		
		
		
		districts[0]= new String[]{"besiktas","kadikoy","uskudar","umraniye"};
		
		districts[1]= new String[]{"goztepe","konak","karsiyaka"};
		
		districts[2]= new String[]{"GOP","cankaya","batikent"};
		
		//create a different array in this : new String
		
		//districts[0]= new String[3]; it is also possible
		 
	
		
			
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < districts.length; i++) {
			
			if(i==0){
				System.out.println("istanbulun ilceleri" + districts[i]+"dir");
			}else if(i==1){
				System.out.println("izmirin ilceleri"+ districts[i]+"dir");
			}else
				System.out.println("ankaranin ilceleri"+ districts[i]+"dir");
			
		} 
		
		/*for(String district : districts[i]){
			System.out.println("\t" + district);
		}*/
		
		
		//for(int j=0; j<districts.length;j++)
		
		int[] myArr = new int[4];
		for (int i : myArr) {
			System.out.println(i);
			
		}
		
	}
		
		
		
		

}