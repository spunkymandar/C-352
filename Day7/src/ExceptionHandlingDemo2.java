
public class ExceptionHandlingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Array does not have two elements
		int data[] = {10,0};
		try {
			int value1 = data[0];
			int value2 = data[1];
			int addition = value1 + value2;
			System.out.println("Addition =" + addition);

			int substraction = value1 - value2;
			System.out.println("Substraction =" + substraction);

			try {
				int division = value1 / value2;
				System.out.println("Division =" + division);
			} catch (ArithmeticException ae) {
				System.err.append("Cannot divide by zero. The value2 must be non-zero");
			}

			int multiplication = value1 * value2;
			System.out.println("Multiplication =" + multiplication);
		} catch (ArrayIndexOutOfBoundsException indexOutOfBoundsException) {
			System.out.println("You should provide atleast 2 members for array");
		}

	}

}
