# Hash Set - Java

Bu sınıf, Java dilinde basit bir Hash Set (Hash Table) veri yapısının bir implementasyonunu içermektedir.

## `HashSetTable` Sınıfı

Bu sınıf, öğrenci bilgilerini içeren `Student` sınıfını kullanarak Hash Set yapısını oluşturur.

### `Entry` Sınıfı

Bu iç içe sınıf, her bir hash set girdisini temsil eder.

#### Özellikler:

- `Student student`: Girdideki öğrenci bilgisini tutar.
- `Entry next`: Aynı hash değerine sahip diğer girişi temsil eden bir sonraki girdiyi işaret eder.

### `HashSetTable` Sınıfı Özellikleri

- `static final int TABLE_SIZE`: Hash set boyutunu belirten sabit.
- `Entry[] table`: Hash set'i temsil eden bir dizi.

### Metodlar:

#### `public HashSetTable()`

- **Açıklama:** Hash Set örneği oluşturur ve hash set'i başlatır.

#### `private int hash(int key)`

- **Açıklama:** Verilen anahtarın hash değerini hesaplar.

#### `public void add(Student student)`

- **Açıklama:** Hash Set'e yeni bir öğrenci ekler.

#### `public boolean contains(int key)`

- **Açıklama:** Verilen anahtarı kullanarak Hash Set'te bir öğrenciyi arar.

#### `public Student delete(int key)`

- **Açıklama:** Verilen anahtarı kullanarak Hash Set'ten bir öğrenciyi siler.

#### `public void printSet()`

- **Açıklama:** Hash Set'in içeriğini ekrana yazdırır.

---

Bu basit Hash Set implementasyonu, öğrenci bilgilerini anahtar (Student ID) kullanarak etkili bir şekilde saklamak ve yönetmek için kullanılabilir.
