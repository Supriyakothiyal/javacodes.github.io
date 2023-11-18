// Shape.java
public class Shape {
    public double getArea() {
        return 0.0;
    }
}

// Rectangle.java
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Rectangle myRectangle = new Rectangle(5.0, 3.0);
        System.out.println("Area of Rectangle: " + myRectangle.getArea()); // Output: Area of Rectangle: 15.0
    }
}
