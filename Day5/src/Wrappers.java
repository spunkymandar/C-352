
public class Wrappers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Wrappers are counter objects of primitives
		/*
		 * int: Integer
		 * float: Float
		 * char: Character
		 * byte: Byte
		 * short: Short
		 * double: Double
		 *  1. Making Java 100 % object oriented programming langauge 
		 *  2. Scenarios where you can use only objects e.g. collection
		 *  3. it provides the services which can be applied on values.
		 */
		
		Integer intObj=new Integer(10);
		Integer intObjString=new Integer("20");
		
		
		
		System.out.println(intObj.intValue());
		
		System.out.println(intObjString.intValue());
		
	//	int x=10;
		
		//Boxing and UnBoxing
		/*
		 * Boxing: Converting the data into object 
		 * 	int x=10;
		 * 	Integer i1=new Integer(x) 
		 * 
		 * Unboxing: Converting the object to value/primitive
		 * 	int value=i1.intValue();
		 */
		
		//AutoBoxing and Auto-UnBoxing: From Java 1.5 onwards
				/*
				 * Auto Boxing: Converting the data into object 
				 * 	
				 * 	Integer i1=10;
				 *  Integer i2=20;
				 * 
				 * Auto Unboxing: Converting the object to value/primitive
				 * 	int ans=i1+i2;
				 */
		
			display(10);
	}
//	public static void display(int x) {
//		System.out.println("int method invoked ");
//	}
	
//	public static void display(double x) {////upcasting/widening
//		System.out.println("double method invoked");
//	}
	public static void display(Double x) {//boxing
		System.out.println("Integer/Wrapper invoked");
	}
//	public static void display(int... x) { //var-argument
//		System.out.println("var arg invoked");
//	}
	
	
	

}
