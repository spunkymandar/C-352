
public class ExceptionHandlingDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int value1 = Integer.parseInt(args[0]);
			int value2 = Integer.parseInt(args[1]);

			int ans = value1 / value2;
			System.out.println("Answer =" + ans);
		} 
		
		//&, && | ||
		
		catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException ex ) {
			
			System.out.println(ex.toString());
		} 
		catch (Exception e) {
			System.out.println(e);
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println(e.getLocalizedMessage());
		}
//		

		/*
		 * 1. ArithmeticException 2. ArrayIndexOutOfBoundsExcpetion 3.
		 * NumberformatExcpetion
		 */
	}

}
