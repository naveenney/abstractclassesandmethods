package abstractclassesandabstractmethods.employee;

abstract class Employee {

	private String name;
	private int employeeId;

	public Employee(String name, int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}

	public abstract double calculatePay();

	public void getEmployeeDetails() {
		System.out.println("Name: " + name);
		System.out.println("Employee ID: " + employeeId);
	}
}
