// Vehicle.java
public class Vehicle {
    private String make;
    private String model;
    private int year;
    private String fuelType;

    // Constructors, getters, and setters

    public double calculateFuelEfficiency() {
        // Implementation
        return 0.0;
    }

    public double calculateDistanceTraveled() {
        // Implementation
        return 0.0;
    }

    public int getMaxSpeed() {
        // Implementation
        return 0;
    }
}

// Truck.java
public class Truck extends Vehicle {
    // Additional properties and methods specific to Truck
}

// Car.java
public class Car extends Vehicle {
    // Additional properties and methods specific to Car
}

// Motorcycle.java
public class Motorcycle extends Vehicle {
    // Additional properties and methods specific to Motorcycle
}
