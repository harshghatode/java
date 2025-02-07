package com.wipro.java.java8.usecase;

import java.util.*;
import java.util.stream.Collectors;

// Service class that manages employee records with exception handling
public class EmployeeService {
    private List<Employee> employees = new ArrayList<>(); // List to store employees

    // Method to add a new employee
    public void addEmployee(Employee emp) {
        employees.add(emp);
        System.out.println("Employee added: " + emp);
    }

    // Method to remove an employee by ID with error handling
    public void removeEmployee(int id) {
        boolean removed = employees.removeIf(emp -> emp.getId() == id);
        if (removed) {
            System.out.println("Employee with ID " + id + " removed.");
        } else {
            System.out.println("Error: Employee with ID " + id + " not found.");
        }
    }

    // Method to search an employee by ID with exception handling
    public Optional<Employee> searchEmployee(int id) {
        return employees.stream().filter(emp -> emp.getId() == id).findFirst();
    }

    // Method to update an employee's salary with validation
    public void updateSalary(int id, double newSalary) {
        if (newSalary < 0) {
            System.out.println("Error: Salary cannot be negative.");
            return;
        }
        employees.stream().filter(emp -> emp.getId() == id).findFirst().ifPresentOrElse(
            emp -> {
                emp.setSalary(newSalary);
                System.out.println("Salary updated for Employee ID " + id);
            },
            () -> System.out.println("Error: Employee with ID " + id + " not found.")
        );
    }

    // Method to display all employees
    public void displayEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found.");
        } else {
            employees.forEach(System.out::println);
        }
    }

    // Method to filter employees by department
    public List<Employee> filterByDepartment(String department) {
        return employees.stream()
                .filter(emp -> emp.getDepartment().equalsIgnoreCase(department))
                .collect(Collectors.toList());
    }

    // Method to sort employees by name
    public List<Employee> sortByName() {
        return employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .collect(Collectors.toList());
    }

    // Method to calculate the average salary of employees
    public double getAverageSalary() {
        return employees.stream().mapToDouble(Employee::getSalary).average().orElse(0.0);
    }
}