package stack;

import model.Student;

public class Stack {

    private Node top;

    private static class Node {
        Student student;
        Node next;

        Node(Student student) {
            this.student = student;
            this.next = null;
        }
    }

    public Stack() {
        this.top = null;
    }

    public void push(Student student) {
        Node newNode = new Node(student);
        newNode.next = top;
        top = newNode;
    }

    public Student pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot pop from an empty stack.");
        }

        Student poppedStudent = top.student;
        top = top.next;
        return poppedStudent;
    }

    public Student peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty. Cannot peek at an empty stack.");
        }

        return top.student;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }

        Node current = top;
        while (current != null) {
            System.out.println("Student ID: " + current.student.getStudentId() + ", Name: " + current.student.getName());
            current = current.next;
        }
    }
}
