# ☕ Java Basics: `break` and `continue`

## 📌 Introduction

In Java, `break` and `continue` are **control statements** used to alter the normal flow of loops and switch statements.

---

## 🔍 `break` Statement

### 🔹 Definition:

The `break` statement is used to **terminate the loop or switch statement immediately**.

### ⚡ Key Points:

* Exits the loop instantly
* Control moves to the statement after the loop
* Commonly used in loops and switch cases

---

## 🔁 Behavior of `break`

* When encountered inside a loop:

  * Loop stops completely
* When used in switch:

  * Prevents execution of next cases

---

## 🔍 `continue` Statement

### 🔹 Definition:

The `continue` statement is used to **skip the current iteration** and move to the next iteration of the loop.

### ⚡ Key Points:

* Does not terminate the loop
* Skips only one iteration
* Loop continues with next cycle

---

## 🔁 Behavior of `continue`

* When encountered:

  * Remaining code in loop is skipped
  * Next iteration begins immediately

---

## 🎯 Difference Between `break` and `continue`

| Feature      | break                | continue               |
| ------------ | -------------------- | ---------------------- |
| Purpose      | Exit loop completely | Skip current iteration |
| Loop Control | Stops loop           | Continues loop         |
| Usage        | Loop & switch        | Only loops             |

---

## ⚠️ Important Notes

* Overuse can make code harder to read
* Should be used carefully for better logic
* Useful in conditions like search, filtering, etc.

---

## 🧠 Summary

* `break` → Stops the loop entirely
* `continue` → Skips current iteration
* Both help control loop execution

---

💡 *Tip:* Use `break` when you want to stop early, and `continue` when you want to skip unwanted cases.
