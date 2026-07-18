package algorithms;

import java.util.ArrayList;
import model.Student;

public class BubbleSort {

    
    public static void sortByName(ArrayList<Student> students) {

        int n = students.size();

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (students.get(j).getName()
                        .compareToIgnoreCase(students.get(j + 1).getName()) > 0) {

                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }

        System.out.println("Students sorted by Name.");
    }


    public static void sortByGPA(ArrayList<Student> students) {

        int n = students.size();

        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                if (students.get(j).getGpa() > students.get(j + 1).getGpa()) {

                    Student temp = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, temp);
                }
            }
        }

        System.out.println("Students sorted by GPA.");
    }
}