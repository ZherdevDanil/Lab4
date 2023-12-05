package org.example;

import java.util.Comparator;
// клас реалізує компаратор
public class HeightComparator implements Comparator<Student> {

    //Метод для порівняння зросту студентів
    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getHeight() == o2.getHeight()){
            return 0;
        }
        if (o1.getHeight() < o2.getHeight()){
            return 1;
        }
        return -1;
    }
}
