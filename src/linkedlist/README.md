# Linked List - Java

Bu sınıf, Java dilinde basit bir bağlı liste (Linked List) veri yapısının bir implementasyonunu içermektedir.

## `LinkedList` Sınıfı

Bu sınıf, öğrenci bilgilerini içeren `Student` sınıfını kullanarak bağlı liste yapısını oluşturur.

### `Node` Sınıfı

Bu iç içe sınıf, her bir bağlı liste düğümünü temsil eder.

#### Özellikler:

- `Student student`: Düğümdeki öğrenci bilgisini tutar.
- `Node next`: Bir sonraki düğümü işaret eder.

### `LinkedList` Sınıfı Özellikleri

- `Node head`: Bağlı listenin başını temsil eder.

### Metodlar:

#### `public LinkedList()`

- **Açıklama:** Bağlı liste örneği oluşturur ve bağlı listeyi başlatır.

#### `public void add(Student student)`

- **Açıklama:** Bağlı listeye yeni bir öğrenci ekler. Eklenen öğrencinin ID'si başka bir öğrenciyle çakışıyorsa hata fırlatır.

#### `public void printList()`

- **Açıklama:** Bağlı listenin içeriğini ekrana yazdırır.

#### `public Student search(int studentId)`

- **Açıklama:** Verilen öğrenci ID'sini kullanarak bağlı listede bir öğrenciyi arar. Bulunamazsa hata fırlatır.

#### `public void delete(int studentId)`

- **Açıklama:** Verilen öğrenci ID'sini kullanarak bağlı listeden bir öğrenciyi siler. Silinen öğrenci başka bir düğümle değiştirilir.

---

Bu basit bağlı liste implementasyonu, öğrenci bilgilerini eklemek, aramak ve silmek için kullanılabilir. Projeyi daha iyi anlamak için bu README belgesi, diğer geliştiricilere rehberlik etmek amacıyla hazırlanmıştır.
