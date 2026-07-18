package algorithms;

import java.util.ArrayList;
import model.Student;

public class LinearSearch {

    
    public static Student searchById(ArrayList<Student> students, String studentId) {

        for (Student student : students) {

            if (student.getStudentId().equalsIgnoreCase(studentId)) {
                return student;
            }

        }

        return null;
    }

  
    public static Student searchByName(ArrayList<Student> students, String name) {

        for (Student student : students) {

            if (student.getName().equalsIgnoreCase(name)) {
                return student;
            }

        }

        return null;
    }
}