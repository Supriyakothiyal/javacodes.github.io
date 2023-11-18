// Animal.java
public abstract class Animal {
    public abstract void sound();
}

// Lion.java
public class Lion extends Animal {
    @Override
    public void sound() {
        System.out.println("Roar");
    }
}

// Tiger.java
public class Tiger extends Animal {
    @Override
    public void sound() {
        System.out.println("Growl");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Lion myLion = new Lion();
        myLion.sound(); // Output: Roar

        Tiger myTiger = new Tiger();
        myTiger.sound(); // Output: Growl
    }
}
