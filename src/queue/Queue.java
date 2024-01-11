package queue;

import model.Student;

public class Queue {
    private Node front;
    private Node rear;

    private static class Node {
        Student student;
        Node next;

        Node(Student student) {
            this.student = student;
            this.next = null;
        }
    }

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(Student student) {
        Node newNode = new Node(student);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
    }

    public Student dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot dequeue from an empty queue.");
        }

        Student dequeuedStudent = front.student;
        front = front.next;

        if (front == null) {
            rear = null;
        }

        return dequeuedStudent;
    }

    public Student peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty. Cannot peek at an empty queue.");
        }

        return front.student;
    }

    public boolean contains(int studentId) {
        Node current = front;
        while (current != null) {
            if (current.student.getStudentId() == studentId) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        Node current = front;
        while (current != null) {
            System.out.println("Student ID: " + current.student.getStudentId() + ", Name: " + current.student.getName());
            current = current.next;
        }
    }
}
