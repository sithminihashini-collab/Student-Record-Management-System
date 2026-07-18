package service;

import java.util.LinkedList;
import java.util.Queue;
import model.Student;

public class RegistrationQueue {

    private Queue<Student> queue;

    
    public RegistrationQueue() {
        queue = new LinkedList<>();
    }

    
    public void enqueue(Student student) {
        queue.offer(student);
        System.out.println(student.getName() + " added to registration queue.");
    }

    
    public Student dequeue() {

        if (queue.isEmpty()) {
            System.out.println("Registration queue is empty.");
            return null;
        }

        return queue.poll();
    }

    
    public void displayQueue() {

        if (queue.isEmpty()) {
            System.out.println("Registration queue is empty.");
            return;
        }

        System.out.println("\n===== Registration Queue =====");

        for (Student student : queue) {
            System.out.println(student);
        }
    }

    
    public boolean isEmpty() {
        return queue.isEmpty();
    }
}