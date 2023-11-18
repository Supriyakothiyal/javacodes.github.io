// Vehicle.java
public class Vehicle {
    public void drive() {
        System.out.println("Driving a vehicle");
    }
}

// Car.java
public class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println("Repairing a car");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.drive(); // Output: Repairing a car
    }
}
