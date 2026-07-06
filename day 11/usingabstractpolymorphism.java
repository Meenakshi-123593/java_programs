package day

import java.util.*;

abstract class Employee {
    protected String name;
    protected int employeeId;
    protected double basicSalary;

    public Employee(String name, int employeeId, double basicSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.basicSalary = basicSalary;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}

class Manager extends Employee {
    public Manager(String name, int employeeId, double basicSalary) {
        super(name, employeeId, basicSalary);
    }

    public double calculateSalary() {
        return basicSalary + (0.20 * basicSalary);
    }
}

class Developer extends Employee {
    public Developer(String name, int employeeId, double basicSalary) {
        super(name, employeeId, basicSalary);
    }

    public double calculateSalary() {
        return basicSalary + (0.10 * basicSalary);
    }
}

class Intern extends Employee {
    public Intern(String name, int employeeId, double basicSalary) {
        super(name, employeeId, basicSalary);
    }

    public double calculateSalary() {
        return basicSalary;
    }
}

public class usingabstractpolymorphism {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int id = scanner.nextInt();
            String name = scanner.next();
            double basicSalary = scanner.nextDouble();
            String role = scanner.next();

            Employee emp = null;

            switch (role.toLowerCase()) {
                case "manager":
                    emp = new Manager(name, id, basicSalary);
                    break;

                case "developer":
                    emp = new Developer(name, id, basicSalary);
                    break;

                case "intern":
                    emp = new Intern(name, id, basicSalary);
                    break;

                default:
                    System.out.println("Invalid role");
                    continue;
            }

            employees.add(emp);
        }

        for (Employee emp : employees) {
            emp.displayDetails();

            String role;

            if (emp instanceof Manager)
                role = "Manager";
            else if (emp instanceof Developer)
                role = "Developer";
            else
                role = "Intern";

            System.out.println("Role: " + role);
            System.out.println("Salary: " + emp.calculateSalary());
            System.out.println();
        }

        scanner.close();
    }
}
