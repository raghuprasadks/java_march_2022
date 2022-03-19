package collectionsdemo;

public class Employee {
	// member variables/attributes
	private int code;
	private String name;
	private String dept;
	private String desg;
	private double salary;	
	// Employee constructor
	public Employee(int code,String name,String dept,String desg,double salary) {
	//	code = code;
		this.code = code;
		this.name = name;
		this.dept = dept;
		this.desg = desg;
		this.salary = salary;
	}
	
	public String information() {
		return "Code " +this.code +" Name "+this.name + " Department "+this.dept +" Designation "+this.desg +" Salary "+this.salary;
	}
}
