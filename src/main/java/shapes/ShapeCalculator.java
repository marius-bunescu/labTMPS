package shapes;

import java.util.List;

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
