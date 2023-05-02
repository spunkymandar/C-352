
public enum CoffeeType {
	LATTE(8), NESCOFFEE(10), CAPACHINO(15);
	CoffeeType(int multiplier){
		price=10*multiplier;
	}
	public void createCoffee() {
		System.out.println("Your coffee is getting prepared ");
	}
	public int getPrice() {
		return price;
	}
	int price;
//	public String toString() {
//		return "hellow";
//	}
	
	//public static final CoffeType NESCOFFEE = new CoffeType(10);
	
	

}
