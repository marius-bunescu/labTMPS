Implementation of SOLID Principles
The SOLIDShapesCalculator application demonstrates the following implementations of the SOLID principles:

Single Responsibility Principle (SRP)
The Shape interface defines a single method called calculateArea(). The Circle, Square, and Rectangle classes implement the Shape interface and define their respective properties and methods required for their respective shapes. The ShapeCalculator class is responsible for calculating the total area of all shapes in the list. By separating the Shape interface and its implementations from the calculation logic in the ShapeCalculator class, we adhere to the SRP.

Open/Closed Principle (OCP)
The application is open for extension because new shapes can be added by creating new classes that implement the Shape interface. The application is closed for modification because existing classes do not need to be modified to add new shapes. This adherence to the OCP is demonstrated by the fact that the application can handle new shapes without changing any existing code.

Liskov Substitution Principle (LSP)
The Circle, Square, and Rectangle classes are substitutable for the Shape interface because they implement the calculateArea() method defined in the interface. This adherence to the LSP is demonstrated by the fact that the ShapeCalculator class can handle instances of Circle, Square, and Rectangle classes without knowing their specific implementations.

Interface Segregation Principle (ISP)
The Shape interface defines only one method that all shapes must implement. This adherence to the ISP ensures that clients (such as the ShapeCalculator class) are not forced to depend on methods they do not use.

Dependency Inversion Principle (DIP)
The ShapeCalculator class depends on the Shape interface, rather than on the specific implementations of shapes. This adherence to the DIP ensures that high-level modules (such as the ShapeCalculator class) do not depend on low-level modules (such as the Circle, Square, and Rectangle classes). Both high-level and low-level modules depend on abstractions (such as the Shape interface).

Usage
To run the application, execute the Main class. The application calculates the total area of a list of shapes and outputs the result to the console.

java
Copy code

    public static void main(String[] args) {
    List<Shape> shapes = new ArrayList<>();
    shapes.add(new Circle(5));
    shapes.add(new Square(4));
    shapes.add(new Rectangle(3, 6));

    ShapeCalculator calculator = new ShapeCalculator(shapes);
    double totalArea = calculator.calculateTotalArea();

    System.out.println("Total area: " + totalArea); 
    }

Conclusion
SOLID principles are essential for creating modular, flexible, and maintainable software. This application demonstrates the implementation of all SOL