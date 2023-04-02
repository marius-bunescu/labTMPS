package shapes;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle(5));
        shapes.add(new Square(4));
        shapes.add(new Rectangle(3, 6));

        ShapeCalculator calculator = new ShapeCalculator(shapes);
        double totalArea = calculator.calculateTotalArea();

        System.out.println("Total area: " + totalArea);
    }
}
