
public class OperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//shortcut operators
		//+=,-=,*=,/=, %=
		int x=10;
		x+=5;//x=x+5
		System.out.println(x);
		
		//unary operator
		//++, --
		//Post-incrementing/decrementing unary operators
		x++;//x=x+1
		System.out.println(x);
		x--;//x=x-1
		System.out.println(x);
		
		
		//Pre-incrementing/decrementing unary operators
		++x;//x=x+1
		System.out.println(x);
		--x;//x=x-1
		System.out.println(x);
		
		System.out.println("Demonstartion of pre/post unary operator");
		int value1=10;
		int value2=value1++;
		//1. increasing the value of value1
		//2. initializing the value of value2
		System.out.println(value1 +"  "+value2);
		
		int value3=10;
		int value4=++value3;
		//1. increasing the value of value3
		//2. initializing the value of value4
		System.out.println(value3+"  "+value4);
		
		
		//&&,&
		//||, |
				
		

	}

}
