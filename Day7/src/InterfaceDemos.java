
public class InterfaceDemos implements SecondInterface{

	public void processIt() {// 
		System.out.println("InterfaceDemo implementing the processIt() method. ");
		System.out.println(FirstInterface.value);
		//FirstInterface.value=20;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceDemos demos=new InterfaceDemos();
		
		FirstInterface demos1=new InterfaceDemos();
		SecondInterface demos2=new InterfaceDemos();
		Object demos3=new InterfaceDemos();
		
		
		demos.processIt();

	}

	
	public void performSomeTask() {
		// TODO Auto-generated method stub
		System.out.println("Some is being performed!!");
	}

}
