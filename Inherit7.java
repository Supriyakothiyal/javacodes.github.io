// Person.java
public class Person {
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

// Employee.java
public class Employee extends Person {
    private String jobTitle;
    private String employeeId;

    public String getEmployeeId() {
        return employeeId;
    }

    @Override
    public String getLastName() {
        return super.getLastName() + ", " + jobTitle;
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.getLastName(); // Example of overriding getLastName()
        employee.getEmployeeId(); // Example of getEmployeeId()
    }
}
