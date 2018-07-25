package com.example.mypackage;

import javax.xml.bind.SchemaOutputResolver;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {
        Employee john = new Employee("John Dee", 30);
        Employee tim = new Employee("tim 2",21);
        Employee jack = new Employee("jack",40);
        Employee snow = new Employee("Snow White",22);
        Employee red = new Employee("Red RiddingHood", 35);
        Employee charming = new Employee("Prince Charming", 31);

        List<Employee> employees = new ArrayList<>();
        employees.add(john);
        employees.add(tim);
        employees.add(jack);
        employees.add(snow);
        employees.add(red);
        employees.add(charming);

        printEmployeesByAge(employees, "Employees over 30", employee -> employee.getAge() >30);
        printEmployeesByAge(employees, "Employees 30 and under", employee -> employee.getAge() <= 30);
        printEmployeesByAge(employees, "\nEmployees younger than 25", new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                return employee.getAge()< 25;
            }
        });
//        System.out.println("\nEmployees 30 and younger");
//        System.out.println("==============================");
    }

    private static void printEmployeesByAge(List<Employee> employees,
                                            String ageText,
                                            Predicate<Employee> ageCondition){
        System.out.println(ageText);
        System.out.println("================================");
        for(Employee employee: employees){
            if(ageCondition.test(employee)){
                System.out.println(employee.getName());
            }
        }
    }
}
