# Arrays in Java

## Introduction

An array is a collection of elements of the same data type stored in contiguous memory locations. Each element in an array is identified by its index, which starts from **0**.

Arrays are used to store multiple values in a single variable instead of declaring separate variables for each value.

---

# Why Use Arrays?

* Store multiple values of the same data type.
* Reduce the number of variables in a program.
* Easy to process data using loops.
* Efficient for storing and accessing data.

---

# Syntax

## Declaration

```java
dataType[] arrayName;
```

or

```java
dataType arrayName[];
```

---

## Declaration and Memory Allocation

```java
int[] numbers = new int[5];
```

This creates an integer array capable of storing **5 elements**.

---

## Declaration and Initialization

```java
String[] fruits = {
    "Apple",
    "Banana",
    "Mango",
    "Orange"
};
```

---

# Array Index

Each element is stored at an index.

Example:

```text
Index :   0        1        2        3

Value : Apple   Banana   Mango   Orange
```

Accessing an element:

```java
System.out.println(fruits[2]); // Mango
```

---

# Updating an Element

The value of an array element can be changed using its index.

Example:

```java
fruits[1] = "Pineapple";
```

Result:

```text
Apple
Pineapple
Mango
Orange
```

---

# Array Length

The `length` property returns the total number of elements in an array.

Example:

```java
System.out.println(fruits.length);
```

Output:

```text
4
```

> **Note:** `length` is a property, **not** a method.

Correct:

```java
fruits.length
```

Incorrect:

```java
fruits.length()
```

---

# Traversing an Array

## Using a `for` Loop

```java
for (int i = 0; i < fruits.length; i++) {
    System.out.println(fruits[i]);
}
```

---

## Using an Enhanced `for` Loop

```java
for (String fruit : fruits) {
    System.out.println(fruit);
}
```

The enhanced `for` loop is simpler when you only need to read elements and do not need their indexes.

---

# Types of Arrays

## 1. One-Dimensional Array

Stores elements in a single row.

Example:

```text
10 20 30 40 50
```

---

## 2. Two-Dimensional Array

Stores elements in rows and columns.

Example:

```text
1 2 3
4 5 6
7 8 9
```

Declaration:

```java
int[][] matrix = new int[3][3];
```

---

# Common Operations on Arrays

* Creating an array
* Accessing elements
* Updating elements
* Traversing using loops
* Searching for an element
* Sorting elements
* Finding maximum and minimum values

---

# Advantages

* Easy to store multiple values.
* Fast access using indexes.
* Simple to traverse with loops.
* Improves code readability.

---

# Limitations

* Fixed size after creation.
* Can store only one data type.
* Inserting or deleting elements is not efficient.

---

# Important Exam Points

1. Array indexes start from **0**.
2. All elements must be of the same data type.
3. The size of an array cannot be changed after creation.
4. Use the `length` property to get the array size.
5. Accessing an invalid index causes an `ArrayIndexOutOfBoundsException`.
6. Arrays can be one-dimensional, two-dimensional, or multidimensional.
7. Enhanced `for` loops are used for reading array elements.

---

# Summary

An array is a fixed-size collection of elements of the same data type. It allows efficient storage and access of multiple values using indexes. Arrays can be traversed using both standard `for` loops and enhanced `for` loops, making them one of the most fundamental data structures in Java.