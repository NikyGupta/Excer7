package com.accenture;

public class Student {
	private String name;
    private int rollNumber;
    private int marksSubject1;
    private int marksSubject2;
    private int marksSubject3;

    // Constructor
    public Student(String name, int rollNumber, int marksSubject1, int marksSubject2, int marksSubject3) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marksSubject1 = marksSubject1;
        this.marksSubject2 = marksSubject2;
        this.marksSubject3 = marksSubject3;
    }

    // Method to calculate total marks
    public int calculateTotalMarks() {
        return marksSubject1 + marksSubject2 + marksSubject3;
    }

    // Method to calculate average marks
    public double calculateAverageMarks() {
        return calculateTotalMarks() / 3.0;
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks in Subject 1: " + marksSubject1);
        System.out.println("Marks in Subject 2: " + marksSubject2);
        System.out.println("Marks in Subject 3: " + marksSubject3);    
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("Tarun", 525, 85, 92, 78);

        // Calculate total marks
        int totalMarks = student.calculateTotalMarks();
        System.out.println("Total Marks: " + totalMarks);

        // Calculate average marks
        double averageMarks = student.calculateAverageMarks();
        System.out.println("Average Marks: " + averageMarks);

        // Display student details
        student.displayStudentDetails();
    }
}

