import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String data="This is demonstration of file IO";
		
		File f=new File("file1.txt");
		
		FileOutputStream fos=new FileOutputStream(f,true);
//		FileOutputStream fos1=new FileOutputStream("file1.txt");
//		FileOutputStream fos2=new FileOutputStream("file1.txt",true);
//		FileOutputStream fos3=new FileOutputStream(f,true);
//		
		fos.write(data.getBytes());
		System.out.println("File Written successfully ");

	}

}
