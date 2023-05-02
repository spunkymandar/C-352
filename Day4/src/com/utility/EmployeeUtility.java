package com.utility;

import com.model.Employee;

public class EmployeeUtility {
	
	static int counter;
	public static Employee createEmployee(int empId, String empName, double empSalary) {
		
		counter++;
		return new Employee(empId,empName,empSalary);
		
	}

}

/*package <name_of_package>
 *import packagename.classname;//specific class imports
 *import packagename.*; //all the classes from the package are imported
 *public class  <nameofclass>{
 *
 *
 *}
 * 
 * 
 */
