package com.example;

import java.util.ArrayList;
import java.util.List;

public class App {
    private List<String> students = new ArrayList<>();

    public void addStudent(String name) {
        students.add(name);
    }

    public List<String> viewStudents() {
        return students;
    }

    public static void main(String[] args) {
        App app = new App();
        app.addStudent("Harinee");
        app.addStudent("Arun");
        System.out.println("Student App Running");
        System.out.println("Students: " + app.viewStudents());
    }
}