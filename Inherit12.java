// Animal.java
public class Animal {
    void eat() {
        System.out.println("Eating...");
    }
}

// Dog.java
public class Dog extends Animal {
    void eat() {
        super.eat(); // Calling the superclass method using super
        System.out.println("Dog is eating...");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
    }
}
