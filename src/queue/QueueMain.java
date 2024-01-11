package queue;

import model.Student;

public class QueueMain {
    public static void main(String[] args) {
        Queue studentQueue = new Queue();

        try {

            studentQueue.enqueue(new Student(1, "Muhammed"));
            studentQueue.enqueue(new Student(2, "Cetin"));
            studentQueue.enqueue(new Student(3, "Java"));
            studentQueue.enqueue(new Student(4, "Spring"));
            studentQueue.enqueue(new Student(5, "Core"));

            studentQueue.printQueue();

            System.out.println("-----------------------------------------------------------------------------");

            studentQueue.dequeue();
            studentQueue.printQueue();

            System.out.println("-----------------------------------------------------------------------------");

            studentQueue.peek();
            studentQueue.printQueue();

            System.out.println("-----------------------------------------------------------------------------");

            System.out.println("Search for a student in the queue (Student ID: 2): " + studentQueue.contains(2));

        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
