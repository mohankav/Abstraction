package org.Abstraction;

public abstract class Employee {
	
	
	// abstract Method 
	public  abstract void employeeName() ;
	
	public  abstract void employeeId() ;
	
	
	// non abstract method 
	public  void employeeAddress(String Location) {
		System.out.println("Employee address is "+Location);
	}
	
	// Abstract Method 
	// we can't create object 
	// Method should be in  private to public 
	// ues a keyword abstract in method and class

	
}
