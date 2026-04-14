# ☕ Java Basics: Nested `if` Statement

## 📌 Introduction

A **nested `if` statement** is an `if` statement placed **inside another `if` statement**.
It is used when multiple conditions need to be checked in a **hierarchical manner**.

---

## 🔍 What is Nested `if`?

* An `if` inside another `if`
* Inner condition is checked **only if outer condition is true**
* Helps in handling complex decision-making

---

## 🔁 Flow of Execution

1. Outer `if` condition is evaluated
2. If outer condition is `true` → inner `if` executes
3. If outer condition is `false` → inner `if` is skipped
4. Based on inner condition, corresponding block executes

---

## 🎯 When to Use Nested `if`

* When decisions depend on **multiple levels of conditions**
* When second condition is meaningful only after first is true
* Used in real-life scenarios like:

  * Student grading systems
  * Login and authentication
  * Eligibility checks

---

## ⚡ Key Points

* Inner `if` depends on outer `if`
* Improves logical structuring of conditions
* Helps break complex conditions into smaller steps

---

## ⚠️ Important Notes

* Too many nested `if` statements can reduce readability
* Proper indentation is important
* Logical flow should be clear and structured

---

## 🧠 Summary

* Nested `if` = `if` inside another `if`
* Used for multi-level decision-making
* Inner condition runs only if outer condition is true
* Common in real-world problem solving

---

💡 *Tip:* Avoid deep nesting when possible; use clear logic for better readability.
