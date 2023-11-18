// Animal.java
public class Animal {
    public void move() {
        System.out.println("Generic Animal Movement");
    }
}

// Cheetah.java
public class Cheetah extends Animal {
    @Override
    public void move() {
        System.out.println("Cheetah running");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Cheetah myCheetah = new Cheetah();
        myCheetah.move(); // Output: Cheetah running
    }
}
