
public class Employee implements Comparable<Employee>{
	private int empId;
	private String empFirstName;
	private String empLastName;
	
	public Employee(int empId, String empFirstName, String empLastName) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName + "]";
	}
	
	public boolean equals(Object o) {
		System.out.println("Equals invoked");
		System.out.println(this.hashCode());
		Employee e=(Employee)o;
		if(this.getEmpId()==e.getEmpId() && this.getEmpFirstName().equals(e.getEmpFirstName()))
			return true;
		return false;
	}
	
	public int hashCode() {
		return  empId*5 + empFirstName.length()*7/2;
		//System.out.println(hashValue );
		//return 127;
	}

	@Override
	public int compareTo(Employee o) { //overridden method from  Comparable interface, internally invoked by TreeSet in order to sort collections
		// TODO Auto-generated method stub
		String pattern="firstNameDESC";
		if(pattern.equals("firstNameASC"))
			return this.empFirstName.compareTo(o.empFirstName);
		return o.empFirstName.compareTo(this.empFirstName);
		
	}
	
	

}
