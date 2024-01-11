# Queue - Java

Bu sınıf, Java dilinde basit bir kuyruk (Queue) veri yapısının bir implementasyonunu içermektedir.

## `Queue` Sınıfı

Bu sınıf, öğrenci bilgilerini içeren `Student` sınıfını kullanarak kuyruk yapısını oluşturur.

### `Node` Sınıfı

Bu iç içe sınıf, her bir kuyruk düğümünü temsil eder.

#### Özellikler:

- `Student student`: Düğümdeki öğrenci bilgisini tutar.
- `Node next`: Bir sonraki düğümü işaret eder.

### `Queue` Sınıfı Özellikleri

- `Node front`: Kuyruğun önünü temsil eder.
- `Node rear`: Kuyruğun sonunu temsil eder.

### Metodlar:

#### `public Queue()`

- **Açıklama:** Kuyruk örneği oluşturur ve kuyruğu başlatır.

#### `public void enqueue(Student student)`

- **Açıklama:** Kuyruğa yeni bir öğrenci ekler.

#### `public Student dequeue()`

- **Açıklama:** Kuyruğun başındaki öğrenciyi kuyruktan çıkarır ve döndürür.

#### `public Student peek()`

- **Açıklama:** Kuyruğun başındaki öğrenciyi döndürür ancak kuyruktan çıkarmaz.

#### `public boolean contains(int studentId)`

- **Açıklama:** Verilen öğrenci ID'sini kullanarak kuyrukta bir öğrenciyi arar.

#### `public boolean isEmpty()`

- **Açıklama:** Kuyruğun boş olup olmadığını kontrol eder.

#### `public void printQueue()`

- **Açıklama:** Kuyruğun içeriğini ekrana yazdırır.

---

Bu basit kuyruk implementasyonu, öğrenci bilgilerini eklemek, çıkarmak, kontrol etmek ve yazdırmak için kullanılabilir. Projeyi daha iyi anlamak için bu README belgesi, diğer geliştiricilere rehberlik etmek amacıyla hazırlanmıştır.
