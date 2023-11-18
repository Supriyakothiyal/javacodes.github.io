// Animal.java
public class Animal {
    void makeSound() {
        System.out.println("Generic Animal Sound");
    }
}

// Lion.java
public class Lion extends Animal {
    @Override
    void makeSound() {
        System.out.println("Roar");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Lion myLion = new Lion();
        myLion.makeSound(); // Output: Roar
    }
}
