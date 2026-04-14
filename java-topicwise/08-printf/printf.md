# ☕ Java Basics: `printf` Precision, Width, and Flags

## 📌 Introduction

`printf` in Java allows you to control how output is displayed using **format specifiers**.
Among the most important formatting features are **precision**, **width**, and **flags**.

---

## 🎯 Precision

### 🔍 Definition:

Precision controls the **number of digits displayed after the decimal point** for floating-point values.

### ⚡ Key Points:

* Used mainly with floating-point numbers
* Helps in limiting decimal places
* Improves readability of output

### 📌 Concept:

* Precision is specified after a decimal point in formatting
* Example concept: showing values up to 2 or 3 decimal places

---

## 📏 Width

### 🔍 Definition:

Width specifies the **minimum number of characters** to be used for displaying output.

### ⚡ Key Points:

* Adds spacing if the value is smaller than the width
* Useful for aligning output in columns
* If value is longer than width, it is displayed fully

### 📌 Concept:

* Width ensures consistent spacing
* Helps in creating table-like output

---

## 🚩 Flags

Flags modify how the output is formatted.

### 🔍 Common Flags:

#### 1. Left Alignment (`-`)

* Aligns output to the left
* Default alignment is right

---

#### 2. Zero Padding (`0`)

* Adds zeros instead of spaces
* Useful for formatting numbers like IDs

---

#### 3. Plus Sign (`+`)

* Displays `+` for positive numbers
* Shows sign explicitly

---

#### 4. Space (` `)

* Adds space before positive numbers
* Keeps alignment with negative numbers

---

## ⚡ Combined Usage

* Precision, width, and flags can be used together
* They allow full control over output formatting
* Commonly used in reports, tables, and structured output

---

## ⚠️ Important Notes

* Format must match the data type
* Incorrect usage may cause formatting errors
* Precision mainly applies to floating-point numbers

---

## 🧠 Summary

* **Precision** → Controls decimal places
* **Width** → Controls spacing
* **Flags** → Modify alignment and appearance
* Together, they make output clean and professional

---

💡 *Tip:* Use width and precision together to align data properly in columns.
