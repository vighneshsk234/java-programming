# 🔁 Java do-while Loop Examples

The `do-while` loop executes the block of code **at least once**, even if the condition is false.

## 📌 Syntax

```java
do {
    // code
} while (condition);
```

---

## 1️⃣ Print Numbers from 1 to 5

```java
class PrintNumbers {
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
}
```

---

## 2️⃣ Sum of First N Numbers

```java
import java.util.Scanner;

class SumOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter value of n: ");
        int n = sc.nextInt();

        int i = 1, sum = 0;

        do {
            sum += i;
            i++;
        } while (i <= n);

        System.out.println("Sum = " + sum);
    }
}
```

---

## 3️⃣ Reverse a Number

```java
import java.util.Scanner;

class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        int reverse = 0;

        do {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        } while (num != 0);

        System.out.println("Reversed Number = " + reverse);
    }
}
```

---

## 4️⃣ Password Check

```java
import java.util.Scanner;

class PasswordCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password;

        do {
            System.out.print("Enter password: ");
            password = sc.nextLine();
        } while (!password.equals("admin"));

        System.out.println("Access Granted!");
    }
}
```

---

## 5️⃣ Menu-driven Program

```java
import java.util.Scanner;

class MenuProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n1. Say Hello");
            System.out.println("2. Say Bye");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello!");
                    break;
                case 2:
                    System.out.println("Bye!");
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        } while (choice != 0);
    }
}
```

---

## ✅ Key Points

* Executes **at least once**
* Condition is checked **after execution**
* Useful for:

  * Menu programs
  * Input validation
  * Repeated user interaction

---
