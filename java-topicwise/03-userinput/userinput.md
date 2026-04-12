# ☕ Java Basics: User Input

## 📌 Introduction

User input in Java allows programs to take data from the user during execution.
The most commonly used class for this is the **Scanner** class.

---

## 📦 Importing Scanner Class

```java
import java.util.Scanner;
```

* `Scanner` is part of `java.util` package
* Required to take input from keyboard

---

## 🧱 Creating Scanner Object

```java
Scanner sc = new Scanner(System.in);
```

### 🔍 Explanation:

* `Scanner` → Class name
* `sc` → Object name
* `System.in` → Input stream (keyboard)

---

## ✍️ Taking Different Types of Input

### 🔢 Integer Input

```java
int num = sc.nextInt();
```

### 🔤 String Input (Single Word)

```java
String name = sc.next();
```

### 📝 String Input (Full Line)

```java
String line = sc.nextLine();
```

### 🔢 Double Input

```java
double value = sc.nextDouble();
```

### 🔘 Boolean Input

```java
boolean flag = sc.nextBoolean();
```

---

## 🎯 Example Program

```java
import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your height: ");
        double height = sc.nextDouble();

        System.out.println("\n--- User Details ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);

        sc.close();
    }
}
```

---

## ⚠️ Important Points

* Always import `java.util.Scanner`
* Use correct method for correct data type
* Close the scanner using `sc.close()`
* Be careful when using `nextLine()` after `nextInt()` (newline issue)

---

## ⚡ Common Issue (Important)

```java
int age = sc.nextInt();
String name = sc.nextLine(); // Problem!
```

### ❌ Problem:

* `nextLine()` may skip input

### ✅ Solution:

```java
int age = sc.nextInt();
sc.nextLine(); // consume leftover newline
String name = sc.nextLine();
```

---

## 🧠 Summary

* Use `Scanner` class for user input
* Different methods for different data types
* Handle `nextLine()` carefully
* Always close the scanner

---

💡 *Tip:* Use meaningful prompts like `"Enter your age:"` to make programs user-friendly.
