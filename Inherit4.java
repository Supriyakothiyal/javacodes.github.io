// Employee.java
public class Employee {
    public void work() {
        System.out.println("Employee working");
    }

    public double getSalary() {
        return 0.0;
    }
}

// HRManager.java
public class HRManager extends Employee {
    @Override
    public void work() {
        System.out.println("HR Manager working");
    }

    public void addEmployee() {
        System.out.println("Adding a new employee");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        HRManager hrManager = new HRManager();
        hrManager.work();        // Output: HR Manager working
        hrManager.addEmployee(); // Output: Adding a new employee
    }
}
