// GeometricShape.java
abstract class GeometricShape {
    abstract double area();
    abstract double perimeter();
}

// Triangle.java
class Triangle extends GeometricShape {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    double area() {
        // Implementation for area calculation
        return 0.0;
    }

    @Override
    double perimeter() {
        return side1 + side2 + side3;
    }
}

// Square.java
class Square extends GeometricShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double area() {
        return side * side;
    }

    @Override
    double perimeter() {
        return 4 * side;
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);
        System.out.println("Perimeter of Triangle: " + triangle.perimeter());

        Square square = new Square(4.0);
        System.out.println("Area of Square: " + square.area());
    }
}
