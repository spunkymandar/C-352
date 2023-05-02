
public class Calculator {
	private int number1,number2;
	
//	public void initData(int value1,int value2) {
//		number1=value1;
//		number2=value2;
//	}
	
//	public int addNumbers(int[] numbers) {
//		int sum=0;
//		for(int number:numbers)
//			sum=sum+number;
//		return sum;
//	}
	
	//var-args
	public int addNumbers(int... numbers) {
		int sum=0;
		for(int number:numbers)
		//for(int i=0;i<numbers.length;i++)
			sum=sum+number;
		return sum;
	}
	
	public void doSomething(int x, int... data) {
		
	}
	//doSomething(10,20,30,40)
	public static void main(String[] args) {
		Calculator calculator1=new Calculator();
//		int[] firstNumberGroup= {10,20};
//		int[] secondNumberGroup= {10,20,30};
//		int[] thirdNumberGroup= {10,20,30,40};
//		
//		System.out.println(calculator1.addNumbers(firstNumberGroup));
//		System.out.println(calculator1.addNumbers(secondNumberGroup));
//		System.out.println(calculator1.addNumbers(thirdNumberGroup));
		
		System.out.println(calculator1.addNumbers(10,20));
		System.out.println(calculator1.addNumbers(10,20,34));
		System.out.println(calculator1.addNumbers(10,20,23,54,23));
		System.out.println(calculator1.addNumbers(10,20,23,654,23,65,23));
		System.out.println(calculator1.addNumbers(10,20,87,12,65,23,64,76));
		System.out.println(calculator1.addNumbers(10,20,12,43,23,65,8,23,76,23,7));
		
		
	}

	
}

/*
 * variables : local variables , declared within the method
 * data members : instance varibles/attributes of the object
 */
 
