package org.example;

public class Student {
    private String name;
    private String surname;
    private int height;
    private double weight;
    private int number_in_group;

    public Student(String name, String surname, int height, double weight, int number_in_group) {
        this.name = name;
        this.surname = surname;
        this.height = height;
        this.number_in_group = number_in_group;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getNumber_in_group() {
        return number_in_group;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", surname='" + surname + '\'' +
                        ", height=" + height +
                        ", weight=" + weight +
                        ", number_in_group=" + number_in_group;
    }
}

