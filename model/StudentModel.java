package model;

import java.util.ArrayList;
import java.util.List;

public class StudentModel {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getAllStudents() {
        return students;
    }

    public double calculateAverageGPA() {
        if (students.isEmpty()) return 0.0;
        double total = 0;
        for (Student s : students) {
            total += s.getGpa();
        }
        return total / students.size();
    }

    public List<Student> getAboveAverageStudents() {
        double average = calculateAverageGPA();
        List<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (s.getGpa() > average) {
                result.add(s);
            }
        }
        return result;
    }

    public List<Student> getBelowAverageStudents() {
        double average = calculateAverageGPA();
        List<Student> result = new ArrayList<>();
        for (Student s : students) {
            if (s.getGpa() < average) {
                result.add(s);
            }
        }
        return result;
    }
}
