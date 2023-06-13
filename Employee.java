package com.accenture;

public class Employee {
	 private String name;
	    private int age;
	    private double salary;

	    // Constructor
	    public Employee(String name, int age, double salary) {
	        this.name = name;
	        this.age = age;
	        this.salary = salary;
	    }

	    // Method to calculate yearly salary
	    public double calculateYearlySalary() {
	        return salary * 12;
	    }

	    // Method to give a raise to the employee
	    public void giveRaise(double percentage) {
	        double raiseAmount = (salary * percentage) / 100;
	        salary += raiseAmount;
	        System.out.println("Raise of $" + raiseAmount + " applied successfully.");
	    }

	    // Method to display employee details
	    public void displayEmployeeDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Salary: $" + salary);
	        System.out.println("Yearly Salary: $" + calculateYearlySalary());
	    }

	    // Main method for testing
	    public static void main(String[] args) {
	        // Create an Employee object
	        Employee employee = new Employee("Niky", 23, 5000.0);

	        // Calculate yearly salary
	        double yearlySalary = employee.calculateYearlySalary();
	        System.out.println("Yearly Salary: $" + yearlySalary);

	        // Give a raise of 10%
	        employee.giveRaise(10);

	        // Display employee details
	        employee.displayEmployeeDetails();
	    }
	}

