package org.FullyAbstraction;

public class Client implements Employee, Company {

	@Override
	public void companyName() {
		System.out.println("Company  name is Himach Technology");
	}

	@Override
	public void companyId() {
		System.out.println("Company  Id  is HMT");
		
	}

	@Override
	public void CompanyLocation() {
		System.out.println("Company Location is Karnataka");
		
	}

	@Override
	public void employeeName() {
		System.out.println("Employee name is Kaaviyan");
		
	}

	@Override
	public void employeeId() {
		System.out.println("Employee Id is HMT12");
		
	}

	@Override
	public void employeeLocation() {
		System.out.println("Employee Location  is Tamil Nadu");
	}
	
	public static void main(String[] args) {
		 Client c = new Client();
		 
		 c.companyName();
		 c.companyId();
		 c.CompanyLocation();
		 c.employeeName();
		 c.employeeId();
		 c.employeeLocation();
	}

}
