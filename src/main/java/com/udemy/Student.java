package com.udemy;

/**
 *
 * @author Jan
 */
public class Student {
    private int id;
    private String name;
    private int age;

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    @Override
    public String toString(){
        return String.format("%5d %10s %5d %n", id, name, age);
    }
}
