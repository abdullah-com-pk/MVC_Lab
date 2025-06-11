package controller;

import model.Student;
import model.StudentModel;
import view.StudentView;

public class StudentController {
    private StudentModel model;
    private StudentView view;

    public StudentController(StudentModel model, StudentView view) {
        this.model = model;
        this.view = view;
    }

    public void addStudent(Student student) {
        model.addStudent(student);
    }

    public void updateView() {
        view.printStudentList(model.getAllStudents(), "All Students");
        double average = model.calculateAverageGPA();
        view.printAverageGPA(average);
        view.printStudentList(model.getAboveAverageStudents(), "Above Average GPA Students");
        view.printStudentList(model.getBelowAverageStudents(), "Below Average GPA Students");
    }
}
