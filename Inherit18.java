// Vehicle.java
abstract class Vehicle {
    abstract void startEngine();
    abstract void stopEngine();
}

// Car.java
class Car extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Car Engine Started");
    }

    @Override
    void stopEngine() {
        System.out.println("Car Engine Stopped");
    }
}

// Motorcycle.java
class Motorcycle extends Vehicle {
    @Override
    void startEngine() {
        System.out.println("Motorcycle Engine Started");
    }

    @Override
    void stopEngine() {
        System.out.println("Motorcycle Engine Stopped");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.startEngine();
        myCar.stopEngine();

        Motorcycle myMotorcycle = new Motorcycle();
        myMotorcycle.startEngine();
        myMotorcycle.stopEngine();
    }
}
