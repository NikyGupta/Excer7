package com.accenture;
abstract class Employe {
    private String name;
    private int age;

    // Constructor
    public Employe(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Abstract method to calculate the salary
    public abstract double calculateSalary();

    // Method to display  details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + calculateSalary());
    }
}

class Manager extends Employe {
    private double baseSalary;
    private double bonus;

    // Constructor
    public Manager(String name, int age, double baseSalary, double bonus) {
        super(name, age);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    // Implementation of calculateSalary() method for Manager
    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }
}

class Developer extends Employe {
    private double hourlyRate;
    private int hoursWorked;

    // Constructor
    public Developer(String name, int age, double hourlyRate, int hoursWorked) {
        super(name, age);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    // Implementation of calculateSalary() method for Developer
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
public class EmployeeHierarchy {
	 public static void main(String[] args) {
	        // Create a Manager object
	        Manager manager = new Manager("Banseel", 35, 5000.0, 2000.0);

	        // Display Manager details
	        System.out.println("Manager Details:");
	        manager.displayDetails();

	        System.out.println();

	        // Create a Developer object
	        Developer developer = new Developer("Niky", 23, 50.0, 160);

	        // Display Developer details
	        System.out.println("Developer Details:");
	        developer.displayDetails();
	    }
	}

