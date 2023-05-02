
public class MyApp {
	
	
	public static void main(String[] args) {
		int x=10;
		// TODO Auto-generated method stub
//		Employee employee1=new Employee();
//		employee1.initEmployee(101,"John Doe");
//		employee1.displayEmployee();
//		
//		Employee employee2=new Employee();
//		employee2.initEmployee(102,"Alan Smith");
//		employee2.displayEmployee();
//		
//		Calculator calculator1=new Calculator();
//		calculator1.initData(10, 20);
//		int addition=calculator1.addNumbers();
//		System.out.println("Addition ="+addition);
		
//		Employee e1=new Employee();
//		e1.displayEmployee();
// 5 ways to create objects in java
		
//		Student student1=new Student(101,"John");//invokes the constructor with 2 argument
//		student1.displayStudent();
//		
//		Student student2=new Student(102,"Rakesh");//invokes the constructor with 2 argument
//		student2.displayStudent();
//		
//		Student student3=new Student();//invokes the constructor with 2 argument
//		student3.displayStudent();
		
		
		Dimension dimension1=new Dimension(100,200);
		dimension1.displayDimension();
		changeDimension(dimension1);
		dimension1.displayDimension();
		
	}

	public static void changeDimension(Dimension dimension1) {
		// TODO Auto-generated method stub
		dimension1.height=400;
		dimension1.displayDimension();
	}
	
	
		
	/*
	 * 100 200
	 * 400 200
	 * 1. Pass by value:::::::
	 * 2. Pass by reference
	 * 
	 */
		
	
	
	
	
	
	
	
	
	
	
	

}
