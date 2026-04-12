# ☕ Java Basics: Variables

## 📌 Introduction

A **variable** in Java is a container used to store data.
Each variable has a **type**, a **name**, and a **value**.

---

## 🧱 Variable Declaration

```java
int age;
```

### 🔍 Explanation:

* `int` → Data type (integer)
* `age` → Variable name

---

## ✍️ Variable Initialization

```java
age = 20;
```

* Assigning a value to a variable is called **initialization**

---

## 🔗 Declaration + Initialization

```java
int age = 20;
```

---

## 📦 Types of Variables in Java

### 1. Local Variables

* Declared inside a method
* Must be initialized before use

```java
public class Demo {
    public static void main(String[] args) {
        int x = 10; // local variable
        System.out.println(x);
    }
}
```

---

### 2. Instance Variables

* Declared inside a class but outside methods
* Belong to an object

```java
class Student {
    int marks; // instance variable
}
```

---

### 3. Static Variables

* Declared using `static` keyword
* Shared among all objects

```java
class Student {
    static String college = "GTU";
}
```

---

## 🔤 Naming Rules for Variables

* Must start with a letter, `_`, or `$`
* Cannot start with a number
* Cannot use Java keywords (e.g., `int`, `class`)
* Case-sensitive (`age` and `Age` are different)

---

## ⚠️ Important Points

* Variables must be declared before use
* Java is **strongly typed** (type cannot change)
* Each variable stores only one type of data

---

## 🎯 Example Program

```java
public class VariablesExample {
    public static void main(String[] args) {
        int age = 21;
        double height = 5.9;
        char grade = 'A';
        String name = "Vighnesh";

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Grade: " + grade);
    }
}
```

---

## 📚 Common Data Types

| Data Type | Example      | Description      |
| --------- | ------------ | ---------------- |
| int       | 10           | Integer numbers  |
| double    | 5.5          | Decimal numbers  |
| char      | 'A'          | Single character |
| String    | "Hello"      | Text             |
| boolean   | true / false | Logical values   |

---

## 🧠 Summary

* Variables store data in Java
* Must declare with a data type
* Can be local, instance, or static
* Follow naming rules carefully

---

💡 *Tip:* Choose meaningful variable names like `studentName` instead of `x` for better readability.
