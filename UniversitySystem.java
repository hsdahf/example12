// Subclass Secretary
class Secretary extends Employee {
    private double bonus;

    public Secretary(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    @Override
    public void calculateSalary() {
        // Assume a bonus added to the salary
        double totalSalary = salary + bonus;
        System.out.println(name + "'s monthly salary is: $" + totalSalary);
    }
}

// Main class
public class UniversitySystem {
    public static void main(String[] args) {
        // Create different types of employees
        Employee[] employees = new Employee[4];
        employees[0] = new Professor("Dr. Smith", 5000, 40); // Professor with 40 teaching hours
        employees[1] = new AdministrativeStaff("John Doe", 3000, "HR"); // Administrative staff in HR department
        employees[2] = new Janitor("Jane Doe", 2000, 80); // Janitor worked for 80 hours
        employees[3] = new Secretary("Alice", 2500, 200); // Secretary with a $200 bonus

        // Calculate total monthly salary including benefits for all employees
        double totalSalary = 0;
        for (Employee employee : employees) {
            employee.calculateSalary();
            totalSalary += employee.salary;
        }
        System.out.println("Total monthly salary for all employees: $" + totalSalary);
    }
}