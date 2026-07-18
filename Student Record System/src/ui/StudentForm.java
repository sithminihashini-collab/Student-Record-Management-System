package ui;
import java.util.Scanner;
import model.Student;

public class StudentForm {

    public static Student inputStudent(Scanner input) {

        System.out.print("Student ID : ");
        String id = input.nextLine();

        System.out.print("Name : ");
        String name = input.nextLine();

        System.out.print("Age : ");
        int age = input.nextInt();
        input.nextLine();

        System.out.print("Course : ");
        String course = input.nextLine();

        System.out.print("GPA : ");
        double gpa = input.nextDouble();

        return new Student(id, name, age, course, gpa);

    }
}