# Variable Scope in Java

## Introduction

Variable Scope refers to the region of a program where a variable can be accessed or used.

A variable is only available within the block in which it is declared. If we try to access it outside its scope, Java generates an error.

---

## Types of Variable Scope

### 1. Local Variable Scope

A variable declared inside a method, constructor, or block is called a local variable.

Characteristics:

* Accessible only within the method or block where it is declared.
* Created when the method starts executing.
* Destroyed when the method finishes execution.

Example:

```java id="uvdl94"
public static void main(String[] args) {
    int age = 20;
    System.out.println(age);
}
```

Here, `age` can only be used inside `main()`.

---

### 2. Method Scope

Variables declared inside a method are not accessible in other methods.

Example:

```java id="ak88zq"
static void display() {
    int num = 10;
}
```

The variable `num` exists only inside `display()`.

---

### 3. Block Scope

A variable declared inside a block `{}` can only be used within that block.

Example:

```java id="fcg4md"
if (true) {
    int x = 5;
}
```

The variable `x` cannot be accessed outside the `if` block.

---

### 4. Class Scope (Global Scope)

A variable declared inside a class but outside all methods is called a class variable or global variable.

Characteristics:

* Accessible by all methods of the class.
* Exists throughout the lifetime of the program.

Example:

```java id="lwd6n0"
class Demo {
    static int count = 100;
}
```

All methods in the class can access `count`.

---

## Scope Hierarchy

```text
Class Scope
│
├── Method Scope
│     │
│     └── Block Scope
```

A variable declared in an outer scope can be used in an inner scope, but a variable declared in an inner scope cannot be used in an outer scope.

---

## Variable Lifetime

| Variable Type  | Scope        | Lifetime                |
| -------------- | ------------ | ----------------------- |
| Local Variable | Method/Block | Until method/block ends |
| Block Variable | Block        | Until block ends        |
| Class Variable | Entire Class | Until program ends      |

---

## Common Errors

### Using a Local Variable Outside Its Scope

```java id="4skh5u"
public static void main(String[] args) {
    int age = 20;
}

System.out.println(age);
```

This causes a compilation error because `age` is out of scope.

---

### Using a Block Variable Outside Its Block

```java id="7h89x2"
if(true) {
    int x = 10;
}

System.out.println(x);
```

This also causes a compilation error.

---

## Advantages of Proper Scope Management

* Reduces memory usage.
* Prevents accidental modification of variables.
* Improves code readability.
* Makes debugging easier.

---

## Important Exam Points

1. Scope determines where a variable can be accessed.
2. Local variables are accessible only inside their method.
3. Block variables are accessible only inside their block.
4. Class variables can be accessed by all methods in the class.
5. Variables cannot be accessed outside their declared scope.

---

## Summary

Variable Scope defines the visibility of variables in a Java program. Java provides Local Scope, Method Scope, Block Scope, and Class Scope. Understanding scope helps in writing efficient, secure, and error-free programs.