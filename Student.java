package com.example.di;

public class Student {
    private String name;
    private Course course;

    public Student(String name, Course course) {
        this.name = name;
        this.course = course;
    }

    public void showDetails() {
        System.out.println("----------------------------------------");
        System.out.println("🎓 SPRING DEPENDENCY INJECTION DEMO");
        System.out.println("----------------------------------------");
        System.out.println("\n✅ Student object created successfully!");
        System.out.println("📘 Injected Course: " + course.getCourseName());
        System.out.println("\n👨‍🎓 Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Course: " + course.getCourseName());
        System.out.println("Status: Enrolled Successfully 🎯");
        System.out.println("\n----------------------------------------");
        System.out.println("Spring DI using Java-based Configuration executed successfully!");
        System.out.println("----------------------------------------");
    }
}
