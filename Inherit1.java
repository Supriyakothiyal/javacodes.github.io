// Animal.java
public class Animal {
    public void makeSound() {
        System.out.println("Generic Animal Sound");
    }
}

// Cat.java
public class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.makeSound(); // Output: Meow
    }
}
