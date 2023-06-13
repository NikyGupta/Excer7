package com.accenture;
public class Rectangle {
	private double length;
    private double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public double calculateArea() {
        return length * width;
    }
    
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    public static void main(String[] args) {
        // Create an instance of Rectangle
        Rectangle rect = new Rectangle(5, 3);
        
        // Calculate the area of the rectangle
        double area = rect.calculateArea();
        System.out.println("Area: " + area);  
        
        // Calculate the perimeter of the rectangle
        double perimeter = rect.calculatePerimeter();
        System.out.println("Perimeter: " + perimeter); 
    }
}
