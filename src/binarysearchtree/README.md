# Binary Search Tree (BST) - Java

Bu sınıf, Java dilinde Binary Search Tree (BST) veri yapısının bir implementasyonunu içermektedir.

## `BinarySearchTree` Sınıfı

### `TreeNode` Sınıfı

Bu sınıf, BST'nin düğümlerini temsil eder.

#### Özellikler:

- `Student student`: Düğümdeki öğrenci bilgisini tutar.
- `TreeNode left`: Sol alt ağacın kök düğümünü temsil eder.
- `TreeNode right`: Sağ alt ağacın kök düğümünü temsil eder.

### `BinarySearchTree` Sınıfı Özellikleri

- `TreeNode root`: BST'nin kök düğümünü temsil eder.

### Metodlar:

#### `public BinarySearchTree()`

- **Açıklama:** BST'nin yeni bir örneğini oluşturur.

#### `public void insert(Student student)`

- **Açıklama:** BST'ye yeni bir öğrenci ekler.

#### `private TreeNode insertRecursive(TreeNode root, Student student)`

- **Açıklama:** BST'ye öğrenci eklemek için kullanılan özel rekürsif metod.

#### `public void inOrderTraversal()`

- **Açıklama:** BST'yi inorder (soldan sağa) sıralama ile gezerek ekrana yazdırır.

#### `private void inOrderTraversalRecursive(TreeNode root)`

- **Açıklama:** BST'yi inorder sıralama ile gezerek ekrana yazdırmak için kullanılan özel rekürsif metod.

#### `public Student search(int studentId)`

- **Açıklama:** Verilen öğrenci ID'sine sahip öğrenciyi BST'de arar.

#### `private Student searchRecursive(TreeNode root, int studentId)`

- **Açıklama:** BST'de öğrenci aramak için kullanılan özel rekürsif metod.

#### `public void delete(int studentId)`

- **Açıklama:** Verilen öğrenci ID'sine sahip öğrenciyi BST'den siler.

#### `private TreeNode deleteRecursive(TreeNode root, int studentId)`

- **Açıklama:** BST'den öğrenci silmek için kullanılan özel rekürsif metod.

#### `private TreeNode findMin(TreeNode root)`

- **Açıklama:** BST'deki minimum değeri bulmak için kullanılan özel metod.

#### `public void printTree()`

- **Açıklama:** BST'yi ekrana yazdırır.

#### `private void printTreeRecursive(TreeNode root, int depth)`

- **Açıklama:** BST'yi ekrana yazdırmak için kullanılan özel rekürsif metod.
