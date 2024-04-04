package abstractclassesandabstractmethods.employee;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("ENTER DETAILS FOR HOURLY EMPLOYEE:");
		System.out.print("ENTER THE NAME:");
		String name = scanner.next();
		System.out.print("ENTER THE EMPLOYEE ID:");
		int employeeId = scanner.nextInt();
		System.out.print("ENTER THE HOURLY RATE:");
		double hourlyRate = scanner.nextDouble();
		System.out.print("ENTER THE HOURLY WORKED:");
		int hoursWorked = scanner.nextInt();

		HourlyEmployee hourlyEmployee = new HourlyEmployee(name, employeeId, hourlyRate, hoursWorked);
		System.out.println("ENTER DETAILS FOR SALARIED EMPLOYEE:");
		System.out.print("EMPLOYEE NAME:");
		name = scanner.next();
		System.out.print("ENTER THE EMPLOYEE ID:");
		employeeId = scanner.nextInt();
		System.out.print("ENTER THE SALARY:");
		double salary = scanner.nextDouble();

		SalariedEmployee salariedEmployee = new SalariedEmployee(name, employeeId, salary);

		System.out.println("HOURLY EMPLOYEE DETAILS:");
		hourlyEmployee.getEmployeeDetails();
		System.out.println("Pay:"+ hourlyEmployee.calculatePay());

		System.out.println("SALARIED EMPLOYEE DETAILS:");
		salariedEmployee.getEmployeeDetails();
		System.out.println("Pay:"+ salariedEmployee.calculatePay());

	}
}