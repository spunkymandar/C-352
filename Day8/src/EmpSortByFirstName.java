import java.util.Comparator;

public class EmpSortByFirstName implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		
		return o1.getEmpFirstName().compareTo(o2.getEmpFirstName());
	}

}
