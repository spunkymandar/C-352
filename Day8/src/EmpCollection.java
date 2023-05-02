import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class EmpCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		arrayListDemo();
//		hashSetDemo();//unique and unordered
		
//		treeSetDemo();

	}

	private static void treeSetDemo() {
		// TODO Auto-generated method stub
		TreeSet<Employee> empHashSet=new TreeSet<Employee>();//unique, sorted
		Employee e1=new Employee(101,"John","Doe");
		Employee e2=new Employee(102,"Derek","Bryan");
		Employee e3=new Employee(103,"Alan","Lamb");
		Employee e4=new Employee(101,"John","Doe");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());
		empHashSet.add(e1);empHashSet.add(e2);empHashSet.add(e3);empHashSet.add(e4);
		for(Employee e:empHashSet)
			System.out.println(e);
		
		
		
	}

	private static void hashSetDemo() {
		// TODO Auto-generated method stub
		HashSet<Employee> empHashSet=new HashSet<Employee>();
		Employee e1=new Employee(101,"John","Doe");
		Employee e2=new Employee(102,"Derek","Bryan");
		Employee e3=new Employee(103,"Alan","Lamb");
		Employee e4=new Employee(101,"John","Doe");
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
		System.out.println(e4.hashCode());
		empHashSet.add(e1);empHashSet.add(e2);empHashSet.add(e3);empHashSet.add(e4);
		for(Employee e:empHashSet)
			System.out.println(e);
	}

	private static void arrayListDemo() {
		// TODO Auto-generated method stub
		ArrayList<Employee> empList=new ArrayList<Employee>();
		Employee e1=new Employee(101,"John","Doe");
		Employee e2=new Employee(102,"Derek","Bryan");
		Employee e3=new Employee(101,"Alan","Lamb");
		Employee e4=new Employee(101,"John","Doe");
		
		empList.add(e1);empList.add(e2);empList.add(e3);empList.add(e4);
		for(Employee e:empList)
			System.out.println(e);
	
		Collections.sort(empList, new EmpSortByFirstName());
		
		for(Employee e:empList)
			System.out.println(e);
	
	
	}

}
