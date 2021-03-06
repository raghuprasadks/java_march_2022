package collectionsdemo;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeMaster {

	ArrayList<Employee> emplist = new ArrayList<Employee>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeMaster empMaster = new EmployeeMaster();
		Employee emp1 = new Employee(1,"Raghu","IT","SME",69999);
		empMaster.addEmployee(emp1);
		
		Employee emp2 = new Employee(2,"Radhika","Accounts","Mgr",79999);
		empMaster.addEmployee(emp2);
		empMaster.listEmployee();
		empMaster.listEmployeeWithLoops();
		
	}
	
	public void addEmployee(Employee emp) {
		System.out.println("addEmployee");
		emplist.add(emp);
		
	}	
	
	public void listEmployee() {
		System.out.println("Employee List");
		Iterator<Employee> empItr =emplist.iterator();
		
		while(empItr.hasNext()) {
			Employee emp = empItr.next();
			String info = emp.information();
			System.out.println(info);
		}
	}
	
	public void listEmployeeWithLoops() {
		System.out.println("Employee List With loops");
		for (Employee emp:emplist) {			
			String info = emp.information();
			System.out.println(info);
		}
	}

}
