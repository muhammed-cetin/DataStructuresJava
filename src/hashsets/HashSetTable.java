package hashsets;

import model.Student;

public class HashSetTable {
    private static final int TABLE_SIZE = 5;

    private Entry[] table;

    public HashSetTable() {
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

    public void add(Student student) {
        try {
            int key = student.getStudentId();
            int h = hash(key);

            Entry newEntry = new Entry(student);

            if (table[h] == null) {
                table[h] = newEntry;
            } else {
                Entry current = table[h];
                while (current.next != null) {
                    if (current.student.getStudentId() == key) {
                        throw new IllegalStateException("Duplicate key: " + key);
                    }
                    current = current.next;
                }
                if (current.student.getStudentId() == key) {
                    throw new IllegalStateException("Duplicate key: " + key);
                }
                current.next = newEntry;
            }
        } catch (Exception e) {
            System.err.println("Error in add method: " + e.getMessage());
        }
    }

    public boolean contains(int key) {
        try {
            int h = hash(key);
            Entry current = table[h];

            while (current != null) {
                if (current.student.getStudentId() == key) {
                    return true; // Değer bulundu
                }
                current = current.next;
            }

            return false; // Değer bulunamadı
        } catch (Exception e) {
            System.err.println("Error in contains method: " + e.getMessage());
            return false;
        }
    }

    public Student delete(int key) {
        try {
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
                    return current.student; // Kaldırma başarılı, kaldırılan öğrenciyi döndür
                }
                prev = current;
                current = current.next;
            }

            throw new IllegalStateException("Key not found: " + key);
        } catch (Exception e) {
            System.err.println("Error in remove method: " + e.getMessage());
            return null; // Hata durumunda null döndür
        }
    }

    public void printSet() {
        for (int i = 0; i < TABLE_SIZE; i++) {
            Entry current = table[i];
            while (current != null) {
                System.out.print("(" + current.student.getStudentId() + ", " + current.student.getName() + ") ");
                current = current.next;
            }
        }
        System.out.println();
    }
}
