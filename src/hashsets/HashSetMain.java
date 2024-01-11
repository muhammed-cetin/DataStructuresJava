package hashsets;

import model.Student;

public class HashSetMain {
    public static void main(String[] args) {
        HashSetTable myHashSet = new HashSetTable();

        myHashSet.add(new Student(1, "Muhammed"));
        myHashSet.add(new Student(2, "Cetin"));
        myHashSet.add(new Student(3, "Java"));
        myHashSet.add(new Student(2, "Cetin")); // Duplicasyon hatası, eklenmeyecek
        myHashSet.add(new Student(4, "Core"));

        myHashSet.printSet();

        System.out.println("-----------------------------------------------------------------------------");

        System.out.println(myHashSet.contains(1)); // true
        System.out.println(myHashSet.contains(5)); // false

        System.out.println("-----------------------------------------------------------------------------");

        myHashSet.delete(2);
        myHashSet.printSet();

        System.out.println("-----------------------------------------------------------------------------");

    }
}
