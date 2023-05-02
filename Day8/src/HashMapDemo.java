import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

/*
 * Map : Key-value 
 * 		 object-object
 * 
 * Uniqueness, Un-order key collection
 * HashMap
 */
public class HashMapDemo {
	public static void main(String[] args) {
		HashMap<String,String> myMap=new HashMap<String,String>();
		//HashMap<key,object>
		
		myMap.put("M101", "Yogesh");//Entry
		myMap.put("M102", "Vivek");//Entry
		myMap.put("M103", "Vivek");//Entry
				
		System.out.println(myMap);
		
		String name=myMap.get("M103");
		System.out.println(name);
		
		
//		Set<Entry<String, String>> mySet=myMap.entrySet();
//		
//		Set<Integer> mySet1;
		
		
		
		for(Entry<String,String> entry:myMap.entrySet())
			System.out.println(entry);
		
		
		System.out.println(myMap.keySet());
		System.out.println(myMap.values());
		System.out.println(myMap.getOrDefault("M105","No values are connected with this key"));
		
		System.out.println(myMap.values());
		
		
		HashMap<String, List<String>> library=new HashMap<String, List<String>>();
		
		ArrayList<String> javaBooks=new ArrayList<String>();
		javaBooks.add("Java9");javaBooks.add("Java10");javaBooks.add("Java11");
		
		ArrayList<String> springBooks=new ArrayList<String>();
		springBooks.add("Learn Spring 5.0");springBooks.add("Spring Microservices");springBooks.add("Spring Rest APIs");
		
		library.put("Java", javaBooks);
		library.put("Spring", springBooks);
		
		System.out.println(library.get("Spring"));
		
		
		
		
		
		
		
	}

}
