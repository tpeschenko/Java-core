package org.taskFinal;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Student {
    private String surname;
    private List<Integer> rating;
    private String speciality;

    public Student(String surname, List<Integer> rating, String speciality) {
        this.surname = surname;
        this.rating = rating;
        this.speciality = speciality;
    }
    public double getAverageGrade(){
        return rating.stream()
                .mapToDouble(n -> n)
                .average()
                .orElse(0.0);
    }

    @Override
    public String toString() {
        return "Студент = " + surname + ", Специальность = " + speciality +
                ", Средний балл " + getAverageGrade() + "\n";
    }
}
