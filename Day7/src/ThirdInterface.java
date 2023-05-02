//Java8-way interface 
//default method : with the default implementation of the method
//static method
public interface ThirdInterface {

	
	public  default int processIt(int x) {
		return 0;
	}
	
	public default void processIt() {
		
	}
	
	//you cannot override
	public static void standardProcessImplementation() {
		System.out.println("Something is done in standardized way!!");
	}
	
}
