
public class Student {
	private int studentregNo;
	private String studentName;
	
	//default constructor 
	public Student() {
		//this(102,Jo)
		System.out.println("Constructor invoked.. Attributes getting initiated");
//		this.studentregNo=755;
//		this.studentName="Raj";
		
	}
	
	//overloaded constructor
	public Student(int studentregNo, String studentName) {
		
		this.studentregNo=studentregNo;//this repreasents the current objects
		this.studentName=studentName;
		
	}
	
	public void displayStudent() {
		
		System.out.println(this.studentregNo +" , "+this.studentName);
	}

}



//new Student();
