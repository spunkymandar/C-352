
public class ExceptionHandlingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int value1=10;
		int value2=0;
		
		int addition=value1+value2;
		System.out.println("Addition ="+addition);
		
		int substraction=value1-value2;
		System.out.println("Substraction ="+substraction);
		
		try {
		int division=value1/value2;//excpetion occured
		System.out.println("Trying to attempt the division !!!");
		System.out.println("Division ="+division);
		//f.close()
		}
		catch(ArithmeticException ae) {
			System.err.append("Cannot divide by zero. The value2 must be non-zero");
			//f.close()
		}
		finally {
			System.out.println("Trying to attempt the division !!!");
		}
		
		
		int multiplication=value1*value2;
		System.out.println("Multiplication ="+multiplication);
		
		 
	}

}
