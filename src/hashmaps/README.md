# Hash Map - Java

Bu sınıf, Java dilinde basit bir Hash Map (Hash Table) veri yapısının bir implementasyonunu içermektedir.

## `HashMapTable` Sınıfı

Bu sınıf, öğrenci bilgilerini içeren `Student` sınıfını kullanarak Hash Map yapısını oluşturur.

### `Entry` Sınıfı

Bu iç içe sınıf, her bir hash tablosu girdisini temsil eder.

#### Özellikler:

- `Student student`: Girdideki öğrenci bilgisini tutar.
- `Entry next`: Aynı hash değerine sahip diğer girişi temsil eden bir sonraki girdiyi işaret eder.

### `HashMapTable` Sınıfı Özellikleri

- `static final int TABLE_SIZE`: Hash tablosu boyutunu belirten sabit.
- `Entry[] table`: Hash tablosunu temsil eden bir dizi.

### Metodlar:

#### `public HashMapTable()`

- **Açıklama:** Hash Map örneği oluşturur ve hash tablosunu başlatır.

#### `private int hash(int key)`

- **Açıklama:** Verilen anahtarın hash değerini hesaplar.

#### `public void insert(Student student)`

- **Açıklama:** Hash Map'e yeni bir öğrenci ekler.

#### `public Student search(int key)`

- **Açıklama:** Verilen anahtarı kullanarak Hash Map'te bir öğrenci arar.

#### `public Student delete(int key)`

- **Açıklama:** Verilen anahtarı kullanarak Hash Map'ten bir öğrenciyi siler.

#### `public void printTable()`

- **Açıklama:** Hash Map'in içeriğini ekrana yazdırır.

---

Bu basit Hash Map implementasyonu, öğrenci bilgilerini anahtar (Student ID) kullanarak etkili bir şekilde saklamak ve yönetmek için kullanılabilir.
