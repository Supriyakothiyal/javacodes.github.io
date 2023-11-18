// Shape.java
public class Shape {
    public double getPerimeter() {
        return 0.0;
    }

    public double getArea() {
        return 0.0;
    }
}

// Circle.java
public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5.0);
        System.out.println("Perimeter of Circle: " + myCircle.getPerimeter()); // Output: Perimeter of Circle: 31.41592653589793
        System.out.println("Area of Circle: " + myCircle.getArea()); // Output: Area of Circle: 78.53981633974483
    }
}
