package service;

import model.Student;
import java.util.ArrayList;

public class StudentManager {

    
    private ArrayList<Student> students;

    
    public StudentManager() {
        students = new ArrayList<>();
    }

    
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully.");
    }

    
    public void viewAllStudents() {

        if (students.isEmpty()) {
            System.out.println("No student records found.");
            return;
        }

        System.out.println("\n========================================");
        System.out.println("         STUDENT RECORD LIST");
        System.out.println("========================================");


        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("Total Students : " + students.size());
    }

    
    public Student searchStudent(String studentId) {

        for (Student student : students) {

            if (student.getStudentId().equalsIgnoreCase(studentId)) {
                return student;
            }

        }

        return null;
    }


    public boolean updateStudent(String studentId, String name,
                                 int age, String course, double gpa) {

        Student student = searchStudent(studentId);

        if (student != null) {

            student.setName(name);
            student.setAge(age);
            student.setCourse(course);
            student.setGpa(gpa);

            return true;
        }

        return false;
    }

    
    public boolean deleteStudent(String studentId) {

        Student student = searchStudent(studentId);

        if (student != null) {

            students.remove(student);

            return true;
        }

        return false;
    }

    
    public ArrayList<Student> getStudents() {
        return students;
    }

}
