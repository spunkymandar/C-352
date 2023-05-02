import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class EmployeeApp {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Employee e1=new Employee(102,"alex carey");
		serializeEmployee(e1);
		deserialization();

	}

	private static void deserialization() throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream fis=new FileInputStream("emp.dat");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		//Object o=null;
		Employee e=null;
		System.out.println("Objects retrieved successfully");
		
		while((e=(Employee)ois.readObject())!=null)
			System.out.println(e);
		
		ois.close();
		fis.close();
	}

	private static void serializeEmployee(Employee e1) throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fos=new FileOutputStream("emp.dat",true);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(e1);
		System.out.println("Employee serialized");
		/*
		 * 1. open the file into write mode
		 * 2. Create objectoutputstream and pass refeference of fileoutputstream
		 * 3. invoke writeobject on objectoutputstream
		 * 
		 */
		
		oos.close();
		fos.close();
	}

}
