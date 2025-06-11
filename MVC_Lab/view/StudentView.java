package view;

import model.Student;

import java.util.List;

public class StudentView {
    public void printStudentList(List<Student> students, String title) {
        System.out.println("=== " + title + " ===");
        for (Student s : students) {
            System.out.println("Name: " + s.getName() + ", GPA: " + s.getGpa());
        }
        System.out.println();
    }

    public void printAverageGPA(double average) {
        System.out.println("Average GPA: " + average + "\n");
    }
}
