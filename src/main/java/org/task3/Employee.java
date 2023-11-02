package org.task3;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.ArrayList;
import java.util.Calendar;


@Getter
@Setter
@ToString
public class Employee {
    private String name;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    private Calendar birthDate;
    {
        birthDate = Calendar.getInstance();
    }
    private int salary;



    public static int compereDate(Calendar date1, Calendar date2){

        return Long.signum(date1.getTimeInMillis() - date2.getTimeInMillis());
    }

    public static void riseSalary(){
        System.out.println("метод ничего не делает");
    }
}
