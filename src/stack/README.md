# Stack - Java

Bu sınıf, Java dilinde basit bir yığın (Stack) veri yapısının bir implementasyonunu içermektedir.

## `Stack` Sınıfı

Bu sınıf, öğrenci bilgilerini içeren `Student` sınıfını kullanarak yığın yapısını oluşturur.

### `Node` Sınıfı

Bu iç içe sınıf, her bir yığın düğümünü temsil eder.

#### Özellikler:

- `Student student`: Düğümdeki öğrenci bilgisini tutar.
- `Node next`: Bir sonraki düğümü işaret eder.

### `Stack` Sınıfı Özellikleri

- `Node top`: Yığının en üstündeki düğümü temsil eder.

### Metodlar:

#### `public Stack()`

- **Açıklama:** Yığın örneği oluşturur ve yığını başlatır.

#### `public void push(Student student)`

- **Açıklama:** Yığının üstüne yeni bir öğrenci ekler.

#### `public Student pop()`

- **Açıklama:** Yığının en üstündeki öğrenciyi yığından çıkarır ve döndürür.

#### `public Student peek()`

- **Açıklama:** Yığının en üstündeki öğrenciyi döndürür ancak yığından çıkarmaz.

#### `public boolean isEmpty()`

- **Açıklama:** Yığının boş olup olmadığını kontrol eder.

#### `public void printStack()`

- **Açıklama:** Yığının içeriğini ekrana yazdırır.

---

Bu basit yığın implementasyonu, öğrenci bilgilerini eklemek, çıkarmak, kontrol etmek ve yazdırmak için kullanılabilir. Projeyi daha iyi anlamak için bu README belgesi, diğer geliştiricilere rehberlik etmek amacıyla hazırlanmıştır.
