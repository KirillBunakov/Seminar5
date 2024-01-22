import java.util.ArrayList;
import java.util.List;

import Controllers.ControllerClass;
import Controllers.Interfaces.iGetModel;
import Controllers.Interfaces.iGetView;
import Model.ModelClass;
import Model.Domain.Student;
import View.ViewClassEng;

public class App {
  public static void main(String[] args) {
    Student student1 = new Student("Ivan", 25);
    Student student2 = new Student("Timur", 25);
    Student student3 = new Student("Kirill", 25);
    List<Student> studList = new ArrayList<>();
    studList.add(student1);
    studList.add(student2);
    studList.add(student3);

    // Вывод студентов на русском
    // iGetModel model = new ModelClass(studList);
    // iGetView view = new ViewClass();
    // ControllerClass controller = new ControllerClass(model, view);
    // controller.run();

    // Вывод студентов на английском
    iGetModel model1 = new ModelClass(studList);
    iGetView view1 = new ViewClassEng();
    ControllerClass controller1 = new ControllerClass(model1, view1);
    controller1.run();

  }
}
