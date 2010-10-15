
public class ArrayExample {

	public static void main(String[] args) {
		
		//defining arrays:
		
		int[] myIntegerArray= {12,34,21,45,23};
		
		int[] myIntegerArray2 = new int[4];
		
		myIntegerArray2[0] = 13;
		myIntegerArray2[1] = 25;
		myIntegerArray2[2] = 34;
		myIntegerArray2[3] = 42;
		
		for (int i = 0; i < myIntegerArray.length; i++) {
			
			System.out.println(myIntegerArray[i]);
			
		}
		
		//foreach loop
		
		for(int i: myIntegerArray){
			System.out.println(i);
		}
		
		//two dimensional array
		
		String[][] districts = new String[3][];
		
		//districts[0][0] ="besiktas";
		//0 --> Istanbul, 1--> Izmir, 2 --> Ankara
		districts[0] = new String[]{"besiktas","kadikoy","uskudar","umraniye"};
		districts[1] = new String[]{"Goztepe","Konak","Karsiyaka"};
		districts[2] = new String[]{"GOP", "Cankaya", "Batikent"};
		//districts[0] = new String[3];
		
		for (int i = 0; i < districts.length; i++) {

			if(i==0){
				System.out.println("Districts in Istanbul:");
			}else if(i==1){
				System.out.println("Districts in Izmir:");
			}else{
				System.out.println("Districts in Ankara:");
			}
			
			for (String district : districts[i]) {
				System.out.println("\t" + district);
			}
			/*for (int j = 0; j < districts[i].length; j++) {
				System.out.println(districts[i][j]);
			}*/
			
		}
		
	
	
		
		for (String[] city : districts) {
			for (String district : city) {
				System.out.println(district);
			}
		}
		
		
		
		int[] myArr = new int[4];
		for (int j : myArr) {
			System.out.println(j);
		}
		
		String[] names = new String[3];
		for (String name : names) {
			System.out.println(name);
		}
		
	}
	
}
