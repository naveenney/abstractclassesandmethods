package abstractclassesandabstractmethods.employee;

public class HourlyEmployee extends Employee {

	private double hourlyRate;
	private int hoursWorked;

	public HourlyEmployee(String name, int employeeId, double hourlyRate, int hoursWorked) {
		super(name, employeeId);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	public double calculatePay() {
		return hourlyRate * hoursWorked;
	}
}
