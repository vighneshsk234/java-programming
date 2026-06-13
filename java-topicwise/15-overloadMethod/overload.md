# Method Overloading in Java

## Introduction

Method Overloading is a feature in Java that allows multiple methods to have the same name but different parameter lists within the same class.

The compiler determines which method to call based on:

* Number of parameters
* Data type of parameters
* Order of parameters

Method overloading is an example of **Compile-Time Polymorphism**.

---

## Why Use Method Overloading?

* Improves code readability.
* Allows the same operation to be performed on different types of data.
* Reduces the need to create multiple method names.

Example:

Instead of creating:

```java id="3nvk40"
addTwoNumbers()
addThreeNumbers()
addDoubleNumbers()
```

We can simply use:

```java id="zg8vt8"
add()
```

with different parameter lists.

---

## Syntax

```java id="k0s50w"
returnType methodName(parameterList) {
    // code
}
```

Multiple methods can have the same name as long as their parameter lists are different.

---

## Rules of Method Overloading

### Valid Overloading

#### Different Number of Parameters

```java id="w5bj1i"
add(int a, int b)
add(int a, int b, int c)
```

#### Different Data Types

```java id="t1aglm"
add(int a, int b)
add(double a, double b)
```

#### Different Order of Parameters

```java id="ms7f5o"
display(int a, String b)
display(String b, int a)
```

---

## Invalid Overloading

Changing only the return type is NOT overloading.

```java id="hwb7s0"
int add(int a, int b)
double add(int a, int b)
```

This causes a compilation error because the parameter list is the same.

---

## Real-Life Example

Consider a pizza shop.

A customer may order:

* A regular pizza
* A pizza with size
* A pizza with size and topping
* Multiple pizzas with size and topping

All these actions can use the same method name:

```java id="smbgkh"
bakePizza()
```

with different parameters.

This is method overloading.

---

## Advantages

* Improves readability.
* Increases code reusability.
* Makes programs easier to maintain.
* Supports compile-time polymorphism.

---

## Method Overloading vs Method Overriding

| Method Overloading        | Method Overriding      |
| ------------------------- | ---------------------- |
| Same class                | Parent and child class |
| Compile-time polymorphism | Runtime polymorphism   |
| Different parameters      | Same parameters        |
| No inheritance required   | Inheritance required   |

---

## Important Exam Points

1. Method names must be the same.
2. Parameter lists must be different.
3. Return type alone cannot overload a method.
4. Overloading is resolved at compile time.
5. Method overloading is an example of Compile-Time Polymorphism.

---

## Summary

Method Overloading allows multiple methods with the same name to perform similar tasks using different parameter lists. It improves code readability, flexibility, and reusability while supporting compile-time polymorphism in Java.