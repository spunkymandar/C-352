
public class IfDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//simple if..else
		/*
		 * if(expression)
		 * {
		 * 	block1
		 * }
		 * else
		 * {
		 *  block2
		 * }
		 * else block is optional 
		 * Also if the block contains only a single statement, the curely braces are optional 
		 */
		int value1=10;
		if(value1%2==0) {
			System.out.println("Even number");
			System.out.println("Is divisible by 2");
		}
		
		else 
			System.out.println("Odd number");
			System.out.println("Is not divisible by 2");
		
		
		
		//nested if..else
		/*
		 * if(expression1 && expression2)
		 * {
		 * 	if(expression3)
		 * 	{
		 * 		block 1
		 * 	}
		 * 	else
		 * 	{
		 * 		block2
		 * 	}
		 * }
		 * else
		 * {
		 * 
		 * }
		 */
		int value2=25;
		if(value2%2==0) {
			if(value2%5==0) {
				System.out.println("Number is even and divisible by 5");
			}
			else {
				System.out.println("Number is even but not divisble by 5");
			}
		}
		else {
			System.out.println("Number is odd");
		}
		
	}
		
/*
 * Calculate the grade of student depending upon the marks : 
 * marks are between 90 to 100 : A
 * marks are between 75 to 89  : B
 * marks are between 60 to 74  : Pass
 * below 69					   : Fail
 */
		//ladder if ..else
		/*
		 * if(condition1){
		 * }
		 * else if(condition2){
		 * }
		 * else if(condition3){
		 * }
		 * else{
		 * }
		 */

	}


