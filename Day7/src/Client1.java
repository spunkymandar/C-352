
public class Client1 implements ThirdInterface{

	Client1(){
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void processIt() {
		// TODO Auto-generated method stub
		System.out.println("Client1 way to implement processIt()");
		ThirdInterface.standardProcessImplementation();
	}

}
