# ☕ Java Basics: `public class` and `public static void main()`

## 📌 Introduction

Every Java program starts with a class and a special method called `main()`.
Understanding these two is the first step in learning Java programming.

---

## 🧱 What is a `public class`?

```java
public class HelloWorld {
}
```

### 🔍 Explanation:

* `public` → Access modifier (accessible from anywhere)
* `class` → Keyword used to define a class
* `HelloWorld` → Name of the class (must match file name)

### ⚡ Important Rules:

* The class name **must match the file name**

  * Example: `HelloWorld.java`
* Only **one public class** is allowed per file
* A class is like a **blueprint** for creating objects

---

## 🚀 What is `public static void main()`?

```java
public static void main(String[] args) {
    System.out.println("Hello, World!");
}
```

This is the **entry point** of any Java program.
Execution always starts from the `main()` method.

---

## 🔍 Breakdown of `main()` Method

### 1. `public`

* Accessible from anywhere
* Required so JVM can call it

### 2. `static`

* Can be called **without creating an object**
* JVM calls it directly using class name

### 3. `void`

* Return type = nothing (no value returned)

### 4. `main`

* Method name (fixed, cannot be changed)

### 5. `String[] args`

* Used to pass **command-line arguments**
* `args` is just a variable name (can be changed)

---

## 🧠 Full Example Program

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Welcome to Java!");
    }
}
```

---

## ⚠️ Key Points to Remember

* Java is **case-sensitive**
* `main()` method must have exact syntax
* Program execution starts from `main()`
* Class name and file name must match

---

## 🎯 Summary

* `public class` → Defines the structure of the program
* `main()` method → Starting point of execution
* JVM always looks for `public static void main()`

---

💡 *Tip:* Always start your Java learning by understanding this structure clearly — it’s the foundation of everything in Java.
