package service;

import java.util.Stack;
import model.Student;

public class UndoManager {

    private Stack<Student> deletedStudents;

    
    public UndoManager() {
        deletedStudents = new Stack<>();
    }

    
    public void pushDeletedStudent(Student student) {
        deletedStudents.push(student);
    }

    
    public Student undoDelete() {

        if (deletedStudents.isEmpty()) {
            System.out.println("Nothing to undo.");
            return null;
        }

        return deletedStudents.pop();
    }

    
    public boolean isEmpty() {
        return deletedStudents.isEmpty();
    }
}