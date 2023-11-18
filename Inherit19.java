// Person.java
abstract class Person {
    abstract void eat();
    abstract void exercise();
}

// Athlete.java
class Athlete extends Person {
    @Override
    void eat() {
        System.out.println("Athlete eating a balanced diet");
    }

    @Override
    void exercise() {
        System.out.println("Athlete doing intense training");
    }
}

// LazyPerson.java
class LazyPerson extends Person {
    @Override
    void eat() {
        System.out.println("Lazy person eating junk food");
    }

    @Override
    void exercise() {
        System.out.println("Lazy person avoiding exercise");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Athlete athlete = new Athlete();
        athlete.eat();
        athlete.exercise();

        LazyPerson lazyPerson = new LazyPerson();
        lazyPerson.eat();
        lazyPerson.exercise();
    }
}
