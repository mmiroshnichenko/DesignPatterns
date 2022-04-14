package net.mmiroshnichenko.basepatterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        EmployeeFactory employeeFactory = new EmployeeFactory();

        List<Employee> employees = new ArrayList<>();
        employees.add(employeeFactory.getEmployeeBySpecialty("turner"));
        employees.add(employeeFactory.getEmployeeBySpecialty("turner"));
        employees.add(employeeFactory.getEmployeeBySpecialty("turner"));
        employees.add(employeeFactory.getEmployeeBySpecialty("welder"));
        employees.add(employeeFactory.getEmployeeBySpecialty("welder"));
        employees.add(employeeFactory.getEmployeeBySpecialty("welder"));
        employees.add(employeeFactory.getEmployeeBySpecialty("welder"));

        for(Employee employee: employees) {
            employee.doJob();
        }

    }
}
