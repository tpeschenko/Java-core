package org.taskFinal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Петров", Arrays.asList(4, 2, 3, 5), "Математика"));
        students.add(new Student("Сидоров", Arrays.asList(1, 4, 2, 1), "Информатика"));
        students.add(new Student("Иванов", Arrays.asList(5, 2, 3, 5), "Математика"));
        students.add(new Student("Аскеро", Arrays.asList(4, 5, 5, 5), "Информатика"));
        students.add(new Student("Сеньков", Arrays.asList(4, 5, 5, 5), "Информатика"));
        students.add(new Student("Сапего", Arrays.asList(1, 2, 3, 5), "Информатика"));
        students.add(new Student("Иванова", Arrays.asList(4, 2, 3, 5), "Математика"));
        students.add(new Student("Бейтс", Arrays.asList(5, 5, 5, 5), "Информатика"));

        List<Student> resultList = students.stream()
                .filter(n -> n.getSpeciality().equals("Информатика"))
                .filter(n -> n.getAverageGrade() > 4.5)
                .sorted(Comparator.comparingDouble(Student::getAverageGrade).reversed())
                .limit(5)

                .collect(Collectors.toList());

        System.out.println(resultList);

    }


}
