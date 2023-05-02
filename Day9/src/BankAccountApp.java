import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class BankAccountApp {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BankAccount account=new BankAccount("b101", "wiley123", "John Doe", 89000);
		serialize(account);

	}

	private static void serialize(BankAccount account) throws IOException {
		// TODO Auto-generated method stub
		//FileOutputStream fos=new FileOutputStream("accounts.dat");
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("accounts.dat"));
		oos.writeObject(account);
		System.out.println("Object serialized successfully");
	}

}
