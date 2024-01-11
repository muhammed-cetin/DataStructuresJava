package hashmaps;

import model.Student;

public class HashMapMain {
    public static void main(String[] args) {
        HashMapTable myHashTable = new HashMapTable();

        // Öğrenci eklemek
        myHashTable.insert(new Student(1, "Muhammed"));
        myHashTable.insert(new Student(2, "Cetin"));
        myHashTable.insert(new Student(3, "Java"));
        myHashTable.insert(new Student(4, "Core"));
        myHashTable.insert(new Student(5, "Example"));


        // Hash tablosunu yazdırmak
        myHashTable.printTable();

        System.out.println("-----------------------------------------------------------------------------");

        int searchKey = 3;
        try {
            Student foundStudent = myHashTable.search(searchKey);
            System.out.println("Model.Student found with key " + searchKey + ": " + foundStudent.getName());
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("-----------------------------------------------------------------------------");
        int deleteKey = 2;
        try {
            Student deletedStudent = myHashTable.delete(deleteKey);
            System.out.println("Model.Student deleted with key " + deleteKey + ": " + deletedStudent.getName());
        } catch (UnsupportedOperationException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("-----------------------------------------------------------------------------");
        myHashTable.printTable();
    }
}
