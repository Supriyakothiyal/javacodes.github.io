// Animal.java
public class Animal {
    String color = "White";
}

// Dog.java
public class Dog extends Animal {
    String color = "Black";

    void displayColors() {
        System.out.println("Dog color: " + color); // Accessing subclass variable
        System.out.println("Animal color: " + super.color); // Accessing superclass variable using super
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.displayColors();
    }
}
