public enum Apple {
	iMac(10), MacPro(15), MacBook(12);
	
	private int price;
	
	Apple(int p) {
		price = p;
	}
	
	int getPrice(){
		return price;
	}
}