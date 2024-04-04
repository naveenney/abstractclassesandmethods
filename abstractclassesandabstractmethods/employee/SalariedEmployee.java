package abstractclassesandabstractmethods.employee;

public class SalariedEmployee extends Employee {

	private double salary;

	public SalariedEmployee(String name, int employeeId, double salary) {
		super(name, employeeId);
		this.salary = salary;
	}

	public double calculatePay() {
		return salary;
	}
}
