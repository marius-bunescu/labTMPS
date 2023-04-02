Implementation of SOLID Principles
The SOLIDShapesCalculator application demonstrates the following implementations of the SOLID principles:

Single Responsibility Principle (SRP)
The Shape interface defines a single method called calculateArea():

public interface Shape {
    double calculateArea();
    }

The Circle, Square, and Rectangle classes implement the Shape interface and define their respective properties and methods required for their respective shapes:

    public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    }

    public class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side * side;
    }
    }

    public class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
    }

The ShapeCalculator class is responsible for calculating the total area of all shapes in the list:

    public class ShapeCalculator {
    private List<Shape> shapes;

    public ShapeCalculator(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public double calculateTotalArea() {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
    }
    
Open/Closed Principle (OCP)
New shapes can be added by creating new classes that implement the Shape interface, without changing any existing code. For example, a new Triangle class can be added:

    public class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double calculateArea() {
        return 0.5 * base * height;
    }
    }
    
The ShapeCalculator class is closed for modification because it does not need to be modified to handle new shapes.

Liskov Substitution Principle (LSP)
The Circle, Square, and Rectangle classes are substitutable for the Shape interface because they implement the calculateArea() method defined in the interface.

The ShapeCalculator class can handle instances of Circle, Square, and Rectangle classes without knowing their specific implementations:

    public class ShapeCalculator {
    private List<Shape> shapes;

    public ShapeCalculator(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public double calculateTotalArea() {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
    }
    
Interface Segregation Principle (ISP)
The Shape interface defines only one method that all shapes must implement:


    public interface Shape {
    double calculateArea();
    }
This ensures that clients (such as the ShapeCalculator class) are not forced to depend on methods they do not use.

Dependency Inversion Principle (DIP)
The ShapeCalculator class depends on the Shape interface, rather than on the specific implementations of shapes:
    
    public class ShapeCalculator {
    private List<Shape> shapes;

    public ShapeCalculator(List<Shape> shapes) {
        this.shapes = shapes;
    }

    public double calculateTotalArea() {
        double totalArea = 0;
    for (Shape shape : shapes) {
    totalArea += shape.calculateArea();
    }
    return totalArea;
    }
    }

This allows for greater flexibility and modularity in the code, as new shapes can be added by implementing the `Shape` interface without affecting existing code that depends on it.

Conclusion
SOLID principles are essential for creating modular, flexible, and maintainable software. This application demonstrates the implementation of all SOL
