package org.task3;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Иван", 5500);
        employee1.getBirthDate().set(1990, 03, 11);

        Employee employee2 = new Employee("Георгий", 5000);
        employee2.getBirthDate().set(1990, 03, 11);

        Supervisor supervisor1 = new Supervisor("Виктор", 9000);
        supervisor1.getBirthDate().set(1980, 01, 03);

        ArrayList<Employee> allEmployee = new ArrayList<>();
        allEmployee.add(employee1);
        allEmployee.add(employee2);
        allEmployee.add(supervisor1);

        Supervisor.riseSalary(allEmployee, 50);

        System.out.println(employee1.getSalary());



    }
}
