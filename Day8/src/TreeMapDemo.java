import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String, Integer> evenNumbers=new TreeMap<String, Integer>();
		evenNumbers.put("Two", 2);
		evenNumbers.put("Four", 4);
		
		System.out.println(evenNumbers);
		
		Map<String, Map<String,String>> employeeMap=new HashMap<String, Map<String,String>>();
		
		Map<String,String> addressMap1=new HashMap<String,String>();
		addressMap1.put("Permanent", "D304, 1st Lane, Florida");
		addressMap1.put("Temporary", "President Lane, Cananda");
		
		Map<String,String> addressMap2=new HashMap<String,String>();
		addressMap2.put("Permanent", "Silver Apt, Bangalore");
		addressMap2.put("Temporary", "Hotel Victor, Mumbai");
		
		employeeMap.put("Alex", addressMap1);
		employeeMap.put("John", addressMap2);
		
		//System.out.println(employeeMap);
		
		for(Entry<String, Map<String,String>> empMap:employeeMap.entrySet()) {
			//System.out.println(empMap);
			System.out.println(empMap.getKey());
			for(Entry<String,String> addressSet:empMap.getValue().entrySet())
				System.out.println(addressSet.getKey() +" "+addressSet.getValue());
			
		}
		
		
//Create a Map<String, List<Car>
///addtoList add the Car to carlist.. add the list to the carMap
	}

}
