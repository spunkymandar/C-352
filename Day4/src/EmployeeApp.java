import com.model.Employee;
import static java.lang.Math.abs;
import static java.lang.System.out;
import com.utility.EmployeeUtility;


public class EmployeeApp {

	static {
		out.println("I am in the static block ");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		abs(-10.20);
		
		
		Employee employee1=EmployeeUtility.createEmployee(101,"John Doe",50000);
		
//		Employee employee2=new Employee(102,"Aman ",150000);
//		Employee employee3=new Employee(103,"John Doe",50000);
//		Employee employee4=new Employee(104,"Aman ",150000);
//		//System.out.println(employee4.getCounter());//counter's value for employee4
		System.out.println(Employee.getCounter());
		//classname.methodname : if the static method is in other class.
	}
	
	//BankAccount application
	/*
	 * BankAccount: accountId, accountName, initialAmount, accountBalance
	 * 				withdrawAmount(), depositAmount(), getBalance()
	 * 
	 * Add the utility, where you should the total balance available in the bank for 
	 * all the account holders. 
	 * 
	 * Create the application with multiple accounts and invoike the withdrawAmount() 
	 * and depositAmount() randomly
	 * 
	 */
	
}
