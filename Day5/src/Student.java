
public class Student {
	private int studentId;
	private String studentName;
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	public boolean equals(Object obj) {
		
		Student student=(Student)obj;
        if(this.studentId==student.studentId && this.studentName.equals(student.studentName))
        	return true;
        return false;
        
		
    }
	
	public static void main(String[] args) {
		Student student1=new Student(1,"John");
		Student student2=new Student(1,"John");
		//Date d1=new Date(10,10,20);
//		if(student1==student2)
//			System.out.println("Objects are equal");
//		else
//			System.out.println("Objects are unequal");
		
		if(student1.equals(student2))
			System.out.println("Objects are equal");
		else
			System.out.println("Objects are unequal");
		
		
//		
		
	}
	

}
