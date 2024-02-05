package oop.collection;

import java.util.HashSet;
import java.util.Set;

public class BankDriverClass {

	public static void main(String[] args) {
		
		
		Bank bank = new Bank(1, "IFIC");
		Employee employee1 = new Employee(1, "A", "ICT");
		Employee employee2 = new Employee(2, "B", "Finance");
		
		Set<Employee> employees = new HashSet<Employee>();
		
		employees.add(employee1);
		employees.add(employee2);
		
		bank.setEmployee(employees);  
		
		for(Object emp: employees) {
			System.out.println(emp);
		}
	}
	
}