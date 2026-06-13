# Methods in Java

## Introduction

A method is a block of code that performs a specific task. Methods help us organize code into smaller, reusable units. Instead of writing the same code multiple times, we can write it once inside a method and call it whenever needed.

## Why Use Methods?

* Reduces code duplication
* Improves readability
* Makes debugging easier
* Promotes code reusability
* Makes programs modular

## Syntax of a Method

```java
returnType methodName(parameters) {
    // method body
    return value;
}
```

### Components of a Method

#### 1. Return Type

Specifies the type of value returned by the method.

Examples:

* int
* double
* String
* boolean
* void (returns nothing)

#### 2. Method Name

The identifier used to call the method.

Example:

```java
displayMessage()
```

#### 3. Parameters

Values passed to the method.

Example:

```java
add(int a, int b)
```

#### 4. Method Body

Contains the statements that perform the required task.

## Types of Methods

### 1. Method Without Parameters and Without Return Value

```java
static void greet() {
    System.out.println("Hello");
}
```

### 2. Method With Parameters and Without Return Value

```java
static void greet(String name) {
    System.out.println("Hello " + name);
}
```

### 3. Method Without Parameters and With Return Value

```java
static int getNumber() {
    return 10;
}
```

### 4. Method With Parameters and With Return Value

```java
static int add(int a, int b) {
    return a + b;
}
```

## Calling a Method

A method executes only when it is called.

Example:

```java
greet();
```

## Static Methods

A static method belongs to the class and can be called without creating an object.

Example:

```java
static void show() {
    System.out.println("Static Method");
}
```

## Advantages of Methods

* Reusability
* Better program structure
* Easier maintenance
* Improved readability
* Reduced code size

## Important Points

* A method can return only one value at a time.
* The `void` keyword means no value is returned.
* Parameters are optional.
* Methods can be overloaded.
* The `main()` method is the entry point of every Java application.

## Summary

Methods are reusable blocks of code used to perform specific tasks. They help create modular, maintainable, and efficient Java programs. A method may accept parameters, return values, both, or neither depending on the requirement.