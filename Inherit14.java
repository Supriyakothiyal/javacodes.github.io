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

// Tiger.java
public class Tiger extends Animal {
    @Override
    void makeSound() {
        System.out.println("Growl");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Animal myAnimal;

        myAnimal = new Lion();
        myAnimal.makeSound(); // Output: Roar

        myAnimal = new Tiger();
        myAnimal.makeSound(); // Output: Growl
    }
}
