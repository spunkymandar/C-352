
public class Employee {
	
	
	private int empId;
	public String empName;
//	private int dd,mm,yy;//date_of_joining
//	private int dd1,mm1,yy1;//date_of_birth
	private Date dt_of_joining;
	private Date dt_of_birth;
	//Address 
	
	public Employee(int empId, String empName, Date dt_of_joining, Date dt_of_birth) {
		this.empId = empId;
		this.empName = empName;
		this.dt_of_joining = dt_of_joining;
		this.dt_of_birth = dt_of_birth;
	}
	
	public String toString() {
		return this.empId+ " , "+this.empName+" "+this.dt_of_joining;
	}
	
	
	
	public static void main(String[] args) {
		Date joiningDate=new Date(11,4,2023);
		Date birthDate=new Date(10,20,2002);
		if((joiningDate.checkDate()!=false) && (birthDate.checkDate()!=false) ){
		Employee employee1=new Employee(101,"John Doe", joiningDate,birthDate);
		System.out.println("Employee registered successfully");
		System.out.println(employee1);
		}
		else {
			System.out.println("Invalid Date!! Employee cannot be registered !!");
		}
		
		
		
		
	}
	
	

}
