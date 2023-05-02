import java.io.FileWriter;
import java.io.IOException;

public class Demo4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileWriter fw=new FileWriter("file2.txt");
		fw.write("Let us learn the character hierarchy");
		fw.close();
		

	}

}
