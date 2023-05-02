
public class EnumDemo {
	
	public static void main(String[] args) {
//		Color c1=Color.BLUE;//static, object
//		
//		System.out.println(c1);
		
		Coffee coffee=new Coffee();
		System.out.println("Available coffees are:");
		for(CoffeeType ctype:coffee.coffeeType.values()) {
			System.out.print(ctype+" ");
		}
		coffee.coffeeType =CoffeeType.NESCOFFEE;
		System.out.println("You ordered :"+coffee.coffeeType);
		coffee.coffeeType.createCoffee();
		System.out.println("Your bill is :"+coffee.coffeeType.getPrice());
		
	}

}
/*
public enum Color {

static Color BLUE =new Color()

}
*/