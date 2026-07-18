package main;
import java.util.Scanner;
import model.Student;
import service.RegistrationQueue;
import service.StudentManager;
import ui.MainMenu;
import algorithms.BubbleSort;
import algorithms.LinearSearch;
import service.UndoManager;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        StudentManager manager = new StudentManager();

        RegistrationQueue queue = new RegistrationQueue();

        UndoManager undo = new UndoManager();

        int choice;

        do {

            MainMenu.displayMenu();

            choice = input.nextInt();
            input.nextLine();

            switch(choice){

                case 1:

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
                    input.nextLine();

                    Student student = new Student(id, name, age, course, gpa);

                    manager.addStudent(student);
                    
                    queue.enqueue(student);

                break;

                case 2:

                    manager.viewAllStudents();

                break;

                case 3:

                    System.out.print("Enter Student ID : ");

                    String searchId = input.nextLine();

                    Student found = LinearSearch.searchById(manager.getStudents(), searchId);

                    if(found != null){

                        System.out.println(found);

                    }else{

                        System.out.println("Student Not Found");

                    }

                break;

                case 4:

                    System.out.print("Enter Student ID : ");
                    String updateId = input.nextLine();

                    Student updateStudent = manager.searchStudent(updateId);

                    if (updateStudent != null) {

                        System.out.print("New Name : ");
                        String newName = input.nextLine();

                        System.out.print("New Age : ");
                        int newAge = input.nextInt();
                        input.nextLine();

                        System.out.print("New Course : ");
                        String newCourse = input.nextLine();

                        System.out.print("New GPA : ");
                        double newGpa = input.nextDouble();
                        input.nextLine();

                        manager.updateStudent(updateId, newName, newAge, newCourse, newGpa);

                        System.out.println("Student Updated Successfully.");

                        } else {

                            System.out.println("Student Not Found.");

                        }

                    break;

                case 5:

                    System.out.print("Enter Student ID : ");
                    String deleteId = input.nextLine();

                    Student deleteStudent = manager.searchStudent(deleteId);

                    if (deleteStudent != null) {

                        undo.pushDeletedStudent(deleteStudent);

                        manager.deleteStudent(deleteId);

                        System.out.println("Student Deleted Successfully.");

                    } else {

                        System.out.println("Student Not Found.");

                    }

                break;

                case 6:

                    BubbleSort.sortByName(manager.getStudents());

                    manager.viewAllStudents();

                break;
            
                case 7:

                    queue.displayQueue();

                break;

                case 8:

                    Student restore = undo.undoDelete();

                    if (restore != null) {

                        manager.addStudent(restore);

                        System.out.println("Student Restored.");

                    } else {

                        System.out.println("Nothing To Undo.");

                    }
        
                break;

                case 9:

                    System.out.println("Thank You");

                    break;

            }

        } while(choice != 9);

        input.close();

    }

}