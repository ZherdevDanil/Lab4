package org.example;

import java.util.Comparator;
import java.util.Scanner;

//Класс який реалізує інтерфейс Компаратор
public class NameComparator implements Comparator<Student> {

    // Override метод compare дозволяє порівнювати об`єкти однакових типів
    @Override
    public int compare(Student o1, Student o2) {
        //порівнюємо імена студентів за алфавітом
        return o1.getName().compareTo(o2.getName());
    }
}
