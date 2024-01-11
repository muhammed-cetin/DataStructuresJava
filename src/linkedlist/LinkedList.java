package linkedlist;

import model.Student;

public class LinkedList {
    private Node head;

    private static class Node {
        Student student;
        Node next;

        Node(Student student) {
            this.student = student;
            this.next = null;
        }
    }

    public LinkedList() {
        this.head = null;
    }

    public void add(Student student) {
        Node newNode = new Node(student);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                if (current.student.getStudentId() == student.getStudentId()) {
                    throw new IllegalArgumentException("Duplicate student ID"); // Duplicate ID exception
                }
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.println("Student ID: " + current.student.getStudentId() + ", Name: " + current.student.getName());
            current = current.next;
        }
    }

    public Student search(int studentId) {
        Node current = head;
        while (current != null) {
            if (current.student.getStudentId() == studentId) {
                return current.student;
            }
            current = current.next;
        }
        throw new IllegalArgumentException("Student not found"); // Student not found exception
    }

    public void delete(int studentId) {
        if (head == null) {
            throw new IllegalStateException("List is empty"); // Empty list exception
        }

        if (head.student.getStudentId() == studentId) {
            head = head.next; // Delete the head
            return;
        }

        Node current = head;
        Node prev = null;

        while (current != null && current.student.getStudentId() != studentId) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            throw new IllegalArgumentException("Student not found"); // Student not found exception
        }

        prev.next = current.next; // Delete the current node
    }
}
