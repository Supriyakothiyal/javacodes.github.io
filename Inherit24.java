// Shape2D.java
abstract class Shape2D {
    abstract void draw();
    abstract void resize();
}

// Rectangle.java
class Rectangle extends Shape2D {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }

    @Override
    void resize() {
        System.out.println("Resizing a Rectangle");
    }
}

// Circle.java
class Circle extends Shape2D {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }

    @Override
    void resize() {
        System.out.println("Resizing a Circle");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.draw();
        rectangle.resize();

        Circle circle = new Circle();
        circle.draw();
        circle.resize();
    }
}
