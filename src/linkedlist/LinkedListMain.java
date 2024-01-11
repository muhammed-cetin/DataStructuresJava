package linkedlist;

import model.Student;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList studentList = new LinkedList();

        studentList.add(new Student(1, "Muhammed"));
        studentList.add(new Student(2, "Cetin"));
        studentList.add(new Student(3, "Java"));
        studentList.add(new Student(4, "Spring"));
        studentList.add(new Student(5, "Core"));

        studentList.printList();

        System.out.println("-----------------------------------------------------------------------------");

        try {
            System.out.println("\nSearch for student with ID 2:");
            Student searchedStudent = studentList.search(2);
            System.out.println("Student found: " + searchedStudent.getName());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("-----------------------------------------------------------------------------");

        try {
            System.out.println("\nDelete student with ID 1:");
            studentList.delete(1);
        } catch (IllegalArgumentException | IllegalStateException e) {
            System.out.println(e.getMessage());
        }

        studentList.printList();
        System.out.println("-----------------------------------------------------------------------------");

    }
}
