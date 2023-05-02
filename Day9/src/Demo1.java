import java.io.File;
import java.io.IOException;

public class Demo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("file1.txt"); //Does NOT CREATE any file.
		if(!f.exists())
			f.createNewFile();
		else
			System.out.println("File is already available");
		
		File dir=new File("testDir");
		dir.mkdir();
		System.out.println("Directory created succesfully !!");
	}

}
