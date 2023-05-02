
public class ExceptionDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		calculateTotalAmount(1000,5);
		}
		catch(HugeAmountException amountException) {
			System.out.println(amountException);
		}

	}

	private static void calculateTotalAmount(int i, int j) throws HugeAmountException {
		// TODO Auto-generated method stub
		
		double amount=i*j;
		if(amount<1500)
			System.out.println("Total ="+amount);
		else
			throw new HugeAmountException();
	}

}
