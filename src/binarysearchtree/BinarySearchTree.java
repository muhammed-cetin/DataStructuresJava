package binarysearchtree;

import model.Student;

public class BinarySearchTree {

    private TreeNode root;

    private static class TreeNode {
        Student student;
        TreeNode left;
        TreeNode right;

        TreeNode(Student student) {
            this.student = student;
            this.left = null;
            this.right = null;
        }
    }

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student cannot be null"); // Null student exception
        }
        root = insertRecursive(root, student);
    }

    private TreeNode insertRecursive(TreeNode root, Student student) {
        if (root == null) {
            return new TreeNode(student);
        }

        if (student.getStudentId() == root.student.getStudentId()) {
            throw new IllegalArgumentException("Duplicate student ID"); // Duplicate ID exception
        }

        if (student.getStudentId() < root.student.getStudentId()) {
            root.left = insertRecursive(root.left, student);
        } else {
            root.right = insertRecursive(root.right, student);
        }

        return root;
    }

    public void inOrderTraversal() {
        inOrderTraversalRecursive(root);
    }

    private void inOrderTraversalRecursive(TreeNode root) {
        if (root != null) {
            inOrderTraversalRecursive(root.left);
            System.out.println("Student ID: " + root.student.getStudentId() + ", Name: " + root.student.getName());
            inOrderTraversalRecursive(root.right);
        }
    }

    public Student search(int studentId) {
        if (studentId < 0) {
            throw new IllegalArgumentException("Student ID cannot be negative"); // Negative ID exception
        }
        return searchRecursive(root, studentId);
    }

    private Student searchRecursive(TreeNode root, int studentId) {
        if (root == null || root.student.getStudentId() == studentId) {
            return (root != null) ? root.student : null;
        }

        if (studentId < root.student.getStudentId()) {
            return searchRecursive(root.left, studentId);
        } else {
            return searchRecursive(root.right, studentId);
        }
    }

    public void delete(int studentId) {
        if (studentId < 0) {
            throw new IllegalArgumentException("Student ID cannot be negative"); // Negative ID exception
        }
        root = deleteRecursive(root, studentId);
    }

    private TreeNode deleteRecursive(TreeNode root, int studentId) {
        if (root == null) {
            return null;
        }

        if (studentId < root.student.getStudentId()) {
            root.left = deleteRecursive(root.left, studentId);
        } else if (studentId > root.student.getStudentId()) {
            root.right = deleteRecursive(root.right, studentId);
        } else {
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            root.student = findMin(root.right).student;
            root.right = deleteRecursive(root.right, root.student.getStudentId());
        }

        return root;
    }

    private TreeNode findMin(TreeNode root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    public void printTree() {
        printTreeRecursive(root, 0);
    }

    private void printTreeRecursive(TreeNode root, int depth) {
        if (root != null) {
            printTreeRecursive(root.right, depth + 1);
            System.out.println("Student ID: " + root.student.getStudentId() + ", Name: " + root.student.getName());
            printTreeRecursive(root.left, depth + 1);
        }
    }
}
