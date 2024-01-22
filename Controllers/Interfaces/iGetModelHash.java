package Controllers.Interfaces;

import java.util.HashMap;

import Model.Domain.Student;

public interface iGetModelHash {
  HashMap<Integer, Student> getStudents();
}
