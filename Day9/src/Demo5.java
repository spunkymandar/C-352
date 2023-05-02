import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo5 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileReader fr=new FileReader("file2.txt");
		
		BufferedReader br=new BufferedReader(fr);
		String line=null;
		while((line=br.readLine())!=null)
			System.out.println(line);
		
	}

}
