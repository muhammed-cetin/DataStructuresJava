package binarysearchtree;

import model.Student;

public class BSTMain {
    public static void main(String[] args) {
        BinarySearchTree studentTree = new BinarySearchTree();

        try {

            studentTree.insert(new Student(1, "Muhammed"));
            studentTree.insert(new Student(2, "Cetin"));
            studentTree.insert(new Student(3, "Java"));
            studentTree.insert(new Student(4, "Spring"));
            studentTree.insert(new Student(5, "Core"));

            studentTree.printTree();
            System.out.println("-----------------------------------------------------------------------------");

            System.out.println("In-order Traversal:");
            studentTree.inOrderTraversal();

            System.out.println("-----------------------------------------------------------------------------");


            Student searchedStudent = studentTree.search(2);
            if (searchedStudent != null) {
                System.out.println("Student found: " + searchedStudent.getName());
            } else {
                System.out.println("Student not found");
            }

            System.out.println("-----------------------------------------------------------------------------");

            System.out.println("Delete student with ID 1:");
            studentTree.delete(1);

            System.out.println("-----------------------------------------------------------------------------");


        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
