package Controllers;

import java.util.ArrayList;
import java.util.List;

import Controllers.Interfaces.iGetController;
import Controllers.Interfaces.iGetModel;
import Controllers.Interfaces.iGetView;
import Model.Domain.Student;

public class ControllerClass implements iGetController {

  private iGetModel model;
  private iGetView view;
  private List<Student> studBuffer = new ArrayList<>();

  public ControllerClass(iGetModel model, iGetView view) {
    this.model = model;
    this.view = view;
  }

  private boolean tesdData(List<Student> stud) {
    if (stud.size() > 0) {
      return true;
    } else {
      return false;
    }
  }

  public void update(String Request) {
    // MVP
    studBuffer = model.getStudents();
    if (tesdData(studBuffer)) {
      view.printAllStudent(studBuffer);
    } else {
      System.out.println("Список студентов пуст!");
    }

    // MVC
    // view.printAllStudent(model.getStudents());
  }

  public void run() {
    Command com = (Command) Command.NONE;
    boolean getNewIter = true;
    while (getNewIter) {
      String command = view.prompt("Введите команду:");
      com = Command.valueOf(command.toUpperCase());
      switch (com) {
        case EXIT:
          getNewIter = false;
          System.out.println("Выход из программы");
          break;
        case LIST:
          view.printAllStudent(model.getStudents());
          break;
        case DELETE:
          // Command com1 = (Command) Command.NONE;
          // String command1 = view.prompt("Введите id студента:");
          // com1 = Command.valueOf(command1.toUpperCase());
          // switch (com1) {
          // case ONE:
          // System.out.println("Студент с id 1 удален");
          // break;

          // }

      }
    }
  }
}