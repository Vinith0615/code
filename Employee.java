public class Employee {
    // Properties
    private int salary;
    private String name;

    // Constructor
    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    // Method to get salary
    public int getSalary() {
        return salary;
    }

    // Method to get name
    public String getName() {
        return name;
    }

    // Method to set name
    public void setName(String name) {
        this.name = name;
    }

    // Main method to test the class
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 50000);

        System.out.println("Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());

        emp.setName("Bob");
        System.out.println("Updated Name: " + emp.getName());
    }
}