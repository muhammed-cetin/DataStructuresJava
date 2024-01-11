package stack;

import model.Student;

public class StackMain {
    public static void main(String[] args) {
        Stack studentStack = new Stack();

        try {

            studentStack.push(new Student(1, "Muhammed"));
            studentStack.push(new Student(2, "Cetin"));
            studentStack.push(new Student(3, "Java"));
            studentStack.push(new Student(4, "Spring"));
            studentStack.push(new Student(5, "Core"));

            studentStack.printStack();

            System.out.println("-----------------------------------------------------------------------------");

            Student poppedStudent = studentStack.pop();
            System.out.println("Popped Student: " + poppedStudent.getName());

            System.out.println("-----------------------------------------------------------------------------");

            Student peekedStudent = studentStack.peek();
            System.out.println("Peeked Student: " + peekedStudent.getName());

            System.out.println("-----------------------------------------------------------------------------");

            studentStack.printStack();

            System.out.println("-----------------------------------------------------------------------------");

        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
