import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//File f=new File()
		FileInputStream fis=new FileInputStream("file1.txt");
		//System.out.println(fis.read());
		int i=0;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
//		
	}

}
