package hashmaps;

import model.Student;

public class HashMapTable {

    private static final int TABLE_SIZE = 5;

    private Entry[] table;

    public HashMapTable() {
        table = new Entry[TABLE_SIZE];
    }

    private static class Entry {
        Student student;
        Entry next;

        Entry(Student student) {
            this.student = student;
        }
    }

    private int hash(int key) {
        return Math.abs(key - 1) % TABLE_SIZE;
    }

    public void insert(Student student) {
        int key = student.getStudentId();
        int h = hash(key);

        Entry newEntry = new Entry(student);

        if (table[h] == null) {
            table[h] = newEntry;
        } else {
            Entry current = table[h];
            while (current.next != null) {
                if (current.student.getStudentId() == key) {
                    throw new UnsupportedOperationException("Duplicate key");
                }
                current = current.next;
            }
            if (current.student.getStudentId() == key) {
                throw new UnsupportedOperationException("Duplicate key");
            }
            current.next = newEntry;
        }
    }

    public Student search(int key) {
        int h = hash(key);
        Entry current = table[h];

        while (current != null) {
            if (current.student.getStudentId() == key) {
                return current.student;
            }
            current = current.next;
        }

        throw new UnsupportedOperationException("Model.Student not found");
    }

    public Student delete(int key) {
        int h = hash(key);
        Entry current = table[h];
        Entry prev = null;

        while (current != null) {
            if (current.student.getStudentId() == key) {
                if (prev == null) {
                    table[h] = current.next;
                } else {
                    prev.next = current.next;
                }
                return current.student;
            }
            prev = current;
            current = current.next;
        }

        throw new UnsupportedOperationException("Model.Student not found");
    }

    public void printTable() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            System.out.print("Bucket " + (i + 1) + ": ");
            Entry current = table[i];
            while (current != null) {
                System.out.print("(" + current.student.getStudentId() + ", " + current.student.getName() + ") ");
                current = current.next;
            }
            System.out.println();
        }
    }
}
