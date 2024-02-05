package oop.collection;

public class Employee {
	private int employeeId;
	private String employeeName;
	private String employeeDept;

	public Employee(int employeeId, String employeeName, String employeeDept) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeDept = employeeDept;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public String getEmployeeDept() {
		return employeeDept;
	}

}
