package product_statement_6_3;

public class Employee {
	 private int  EmployeeNo;
	 private String EmployeeName;
	 private String Address;
	
	 public Employee() {
		super();
	}

	public Employee(int employeeNo, String employeeName, String address) {
		super();
		EmployeeNo = employeeNo;
		EmployeeName = employeeName;
		Address = address;
		
		
	}

	public int getEmployeeNo() {
		return EmployeeNo;
	}

	public void setEmployeeNo(int employeeNo) {
		EmployeeNo = employeeNo;
	}

	public String getEmployeeName() {
		return EmployeeName;
	}

	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	 
	 
	 
	 

}


