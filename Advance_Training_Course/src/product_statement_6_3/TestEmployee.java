package product_statement_6_3;

import java.util.LinkedList;

public class TestEmployee {
	LinkedList<Employee> ll = new LinkedList<Employee>();

	public static void main(String[] args) {
		TestEmployee te = new TestEmployee();
		te.addInput();
		te.display();

	}

	public void addInput() {
		Employee e1 = new Employee(123, "Nav", "Kav");
		Employee e2 = new Employee(456, "suryah", "up");
		Employee e3 = new Employee(789, "srisri", "mp");
		ll.add(e1);
		ll.add(e2);
		ll.add(e3);
		

	}

	public void display() {
		System.out.println("EmpId   EmpName   Adress");
		for (Employee e : ll) {
			System.out.println(e.getEmployeeNo() + "\t" + e.getEmployeeName() + "\t" + e.getAddress());
		}
	}

}
