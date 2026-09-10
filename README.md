# Array and Java Learning Project

This project tracks my progress in learning Java.

## Learning Topics

### 1. Understanding Arrays
- **Integer Arrays:** Learned how to initialize an integer array (`int[] numbers = {1, 2, 3, 4, 5};`) and iterate through it using an enhanced for-loop (for-each).

  - *Implemented in:* `Day1.java`
- **String Arrays:** Learned about String array initialization and the distinction between String Literals (from String Pool) and explicit `new String()` objects (on the Heap).
  - *Historical context:* Previously implemented in `Day1.java`.

### 2. String Comparison
- **Reference vs. Content:** Learned that `==` compares memory references (identity), while `.equals()` compares the actual textual content of the strings.
  - *Implemented in:* `StringComparison.java`

### 3. Multidimensional Arrays
- **2D Arrays:** Learned that a 2D array is essentially an array of arrays. Used nested loops to iterate through rows and columns.
  - *Code Explanation:* A 2D array (`int[][]`) is like a table. The outer loop iterates through the rows (`matrix.length`), and the inner loop iterates through the columns of each specific row (`matrix[i].length`).
  - *Implemented in:* `MultiArrayDemo.java`

### 4. Ragged Arrays
- **Definition:** A ragged array is a 2D array where each row can have a different number of columns.
  - *Code Explanation:* Because each row is its own independent array, we just need to ensure the inner loop checks the length of the *current* row (`ragged[i].length`) rather than assuming a fixed column count.
  - *Implemented in:* `RaggedArrayDemo.java`

### Comparison: Rectangular vs. Ragged Arrays
- **Rectangular (Topic 3):** Rows have uniform lengths (e.g., all rows have 2 columns). Best for representing matrices and grids.
- **Ragged (Topic 4):** Rows have variable lengths (e.g., row 0 has 3, row 1 has 2). Best for variable-length hierarchical data.

### 5. Swapping Array Elements
- **Concept:** Swapping two elements in an array requires a temporary variable (`temp`) to avoid losing the original value of the first element when it is overwritten.
- **Why `temp` is needed:**
  If you try to swap directly:
  ```java
  number[num1] = number[num2]; // The original value of number[num1] is now lost!
  number[num2] = number[num1]; // This just copies the new value back, resulting in no swap.
  ```
  By using `temp`, you preserve the original value:
  ```java
  int temp = number[num1];     // 1. Save original value of number[num1]
  number[num1] = number[num2]; // 2. Overwrite number[num1] with number[num2]
  number[num2] = temp;         // 3. Place saved value into number[num2]
  ```
- **Cup Analogy:**
  Think of swapping juice in Cup A and milk in Cup B. You cannot pour Cup B directly into Cup A without mixing them. Instead, you pour Cup A into a temporary empty Cup C (`temp`), then Cup B into Cup A, and finally Cup C (`temp`) into Cup B.
- *Implemented in:* `Swap_Array.java`

---
## How to Run

1. Compile the code:
   ```bash
   javac Day1.java
   javac StringComparison.java
   javac MultiArrayDemo.java
   javac RaggedArrayDemo.java
   javac Swap_Array.java
   ```
2. Execute the code:
   ```bash
   java Day1
   java StringComparison
   java MultiArrayDemo
   java RaggedArrayDemo
   java Swap_Array
   ```
