import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CollectionBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList<Integer> mycollection=new ArrayList<Integer>();
		
		//HashSet<Integer> mycollection=new HashSet<Integer>();//unique and unordered
		
		TreeSet<Integer> mycollection=new TreeSet<Integer>();//unique and sorted
		
		mycollection.add(10);
		mycollection.add(20);
		mycollection.add(30);
		mycollection.add(30);
		
		
		System.out.println(mycollection);
		for(int i=0;i<mycollection.size();i++)
//		{
//			System.out.println(mycollection.get(i));
//		}
//		
		for(int data:mycollection)
			System.out.println(data);
		
		
		Iterator<Integer> iterator=mycollection.iterator();
		//Iteger<data_tyoe> ref=collectionref.iterator
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		
		//mycollection.
		
		ArrayList<Integer> mycollection1=new ArrayList<Integer>();
		mycollection1.add(100);
		mycollection1.add(200);
		
		mycollection.addAll(mycollection1);
		System.out.println(mycollection);
		
//		System.out.println("Location of 100 :"+mycollection.indexOf(100));
//		mycollection.remove(3);
//		System.out.println(mycollection);
//		mycollection.
		
		
		
	}

}
