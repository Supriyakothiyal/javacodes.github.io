// Employee.java
public class Employee {
    private String name;
    private String address;
    private double salary;
    private String jobTitle;

    // Constructors, getters, and setters

    public double calculateBonus() {
        // Implementation
        return 0.0;
    }

    public String generatePerformanceReport() {
        // Implementation
        return "";
    }

    public void manageProjects() {
        // Implementation
    }
}

// Manager.java
public class Manager extends Employee {
    // Additional properties and methods specific to Manager
}

// Developer.java
public class Developer extends Employee {
    // Additional properties and methods specific to Developer
}

// Programmer.java
public class Programmer extends Developer {
    // Additional properties and methods specific to Programmer
}
