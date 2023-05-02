import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionHandlingDemo4 {
	public static void main(String[] args)  {
		
		File f=new File("d:\\sample53t34.txt");
//		
//		try {
//			readFile(f);
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			System.out.println("File you are trying to access, it not AVAILBALE");
//		}
		
		try {
			readFile(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		int ans=div(10,2);
	}
	
	
	public static void readFile(File f) throws FileNotFoundException {
		FileInputStream fis=new FileInputStream(f);
		
	}

	public static int div(int a, int b) throws ArithmeticException {
		return a/b;
	}
}
