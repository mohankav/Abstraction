package org.Abstraction;

public class Company extends Employee {
	
	
	// Abstract method 
	@Override
	public void employeeName() {
		System.out.println("Employee name is Kaaviyan");
	}

	@Override
	public void employeeId() {
		System.out.println("Employee Id is 1245");
	}
	
	
	// non abstract method 
	@Override
	public void employeeAddress(String Location) {
		super.employeeAddress(Location);
	}
	
	public static void main(String[] args) {
		
		
		Company c = new Company();
		
		c.employeeName();
		c.employeeId();
		c.employeeAddress("Tamil Nadu");
	}
	

}
