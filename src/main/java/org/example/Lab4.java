package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * 1505%11 = 9 => Визначити клас студент, який складається як мінімум з 5-и полів
 * */

public class Lab4 {
    public static void main(String[] args) {

        //Створюємо масив з об'єктами класа Student
        Student[] array = {
                new Student("Anton", "Melnik", 180, 70.1, 7),
                new Student("Taras", "Shevchenko", 190, 87.8, 18),
                new Student("Danylo", "Boyko", 200, 120, 20),
                new Student("Sergiy","Ponomarenko",178,69.3,2),
                new Student("Pavlo","Telenik",184,77.5,23)
        };
        System.out.println("Sort by name");
        Arrays.sort(array,new NameComparator());
        for (Student s : array) {
            System.out.println(s.toString());
        }
        System.out.println("\nSort by height");
        Arrays.sort(array,new HeightComparator());
        for (Student s : array) {
            System.out.println(s.toString());
        }
    }
}