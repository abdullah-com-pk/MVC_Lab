import controller.StudentController;
import model.Student;
import model.StudentModel;
import view.StudentView;

public class Main {
    public static void main(String[] args) {
        StudentModel model = new StudentModel();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);

        controller.addStudent(new Student("Ali Akbar", 3.7));
        controller.addStudent(new Student("Abdullah Sajid", 3.5));
        controller.addStudent(new Student("Sheikh Shayan", 3.2));
        controller.addStudent(new Student("Kazim Shaukat", 2.5));
        controller.addStudent(new Student("Usman Waqar", 2.9));
        controller.addStudent(new Student("Khalid Mehmood", 3.9));
        controller.updateView();
    }
}
