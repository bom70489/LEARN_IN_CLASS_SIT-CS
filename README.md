# Array and Java Learning Project

This project tracks my progress in learning Java.

## Project structure

- `Arrays/`: array examples and exercises
- `Strings/`: string examples
- `Assignments/`: Q1–Q5 exercises
- `Learn_in_class/`: class exercises
- `OOP/`: object-oriented programming examples

## Learning Topics

### 1. Understanding Arrays
- **Integer Arrays:** Learned how to initialize an integer array (`int[] numbers = {1, 2, 3, 4, 5};`) and iterate through it using an enhanced for-loop (for-each).
  - *Implemented in:* `Arrays/Day1.java`
- **String Arrays:** Learned about String array initialization and the distinction between String Literals (from String Pool) and explicit `new String()` objects (on the Heap).
  - *Historical context:* Previously implemented in `Arrays/Day1.java`.

### 2. String Comparison
- **Reference vs. Content:** Learned that `==` compares memory references (identity), while `.equals()` compares the actual textual content of the strings.
  - *Implemented in:* `Strings/StringComparison.java`

### 3. Multidimensional Arrays
- **2D Arrays:** A 2D array is an array of arrays. Nested loops iterate through rows and columns.
  - *Implemented in:* `Arrays/MultiArrayDemo.java`

### 4. Ragged Arrays
- **Definition:** A ragged array is a 2D array where each row can have a different number of columns. Iterate using the length of each current row (`ragged[i].length`).
  - *Implemented in:* `Arrays/RaggedArrayDemo.java`

### 5. Swapping Array Elements
- **Concept:** Swapping two elements in an array requires a temporary variable (`temp`) to preserve the original value.
  - *Implemented in:* `Arrays/Swap_Array.java`

## How to Run

Compile and run the array and string examples from the repository root:

```bash
javac Arrays/Day1.java
java -cp Arrays Day1

javac Strings/StringComparison.java
java -cp Strings StringComparison

javac Arrays/MultiArrayDemo.java
java -cp Arrays MultiArrayDemo

javac Arrays/RaggedArrayDemo.java
java -cp Arrays RaggedArrayDemo

javac Arrays/Swap_Array.java
java -cp Arrays Swap_Array
``

The assignment files are in `Assignments/`. For example:

```bash
javac Assignments/Q1.java
java -cp Assignments Q1
``
