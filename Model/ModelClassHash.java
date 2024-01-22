package Model;

import java.util.HashMap;

import Controllers.Interfaces.iGetModelHash;
import Model.Domain.Student;

public class ModelClassHash implements iGetModelHash {
  private HashMap<Integer, Student> students;

  public ModelClassHash(HashMap<Integer, Student> students) {
    this.students = students;
  }

  public HashMap<Integer, Student> getStudents() {
    return students;
  }
}
