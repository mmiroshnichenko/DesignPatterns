package net.mmiroshnichenko.basepatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class EmployeeFactory {
    private static final Map<String, Employee> employees = new HashMap<>();

    public Employee getEmployeeBySpecialty(String specialty) {
        Employee employee = employees.get(specialty);

        if (employee == null) {
            switch (specialty) {
                case "turner":
                    System.out.println("Hiring Turner...");
                    employee = new Turner();
                    break;
                case "welder":
                    System.out.println("Hiring Welder...");
                    employee = new Welder();
            }
            employees.put(specialty, employee);
        }

        return employee;
    }
}
