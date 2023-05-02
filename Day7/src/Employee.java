
public class Employee implements Cloneable {
	
	private int empId;
	private String empName;
	private Address empAddress;
	
	
	public Employee(int empId, String empName,Address empAddress) {
		super();//super class default constructor is invoked 
		this.empId = empId;
		this.empName = empName;
		this.empAddress=empAddress;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
//
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.empId +" "+this.empName+ this.empAddress;
	}



	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("Finalize() invoked!!");
		//super.finalize();
	}



	public static void main(String[] args) throws Throwable {
		Employee employee1=new Employee(101,"John Doe",new Address("Mumbai","India"));
		Employee employee2=(Employee)employee1.clone();//new Object() --> subclass ref=new super class();
		System.out.println(employee1.empAddress==employee2.empAddress);
		
//		System.out.println(employee2.empAddress);
		System.out.println(employee1);
		System.out.println(employee2);
		
		System.out.println(employee1.hashCode());
		System.out.println(employee2.hashCode());
		
//		if(employee1==employee2)
//			System.out.println("Same object");
//		else
//			System.out.println("Distinct objects");
//		
//		employee1.empId=103;
//		
		//System.out.println(employee1);
		//System.out.println(employee2);
		//employee1.finalize();
		employee1=null;
		System.gc();
		createEmployee();
		
	}
	public static void createEmployee() {
		Employee employee1=new Employee(101,"John Doe",new Address("Mumbai","India"));
	}

}
