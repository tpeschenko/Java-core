package org.task3;

import java.util.ArrayList;

public class Supervisor extends Employee {
    public Supervisor(String name, int salary) {
        super(name, salary);
    }

    public static void riseSalary(ArrayList<Employee> employees, int rise) {
        for (Employee i : employees) {
            if(i instanceof Supervisor) {
            }
            else {
                i.setSalary(i.getSalary() + rise);
            }
        }
    }
}