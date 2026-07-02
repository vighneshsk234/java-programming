import java.util.Scanner;

public class JavaQuizGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] questions = {
                "1. Which keyword is used to create an object in Java?",
                "2. Which method is the entry point of a Java program?",
                "3. Which loop is guaranteed to execute at least once?",
                "4. Which symbol is used to inherit a class in Java?",
                "5. Which package contains the Scanner class?"
        };

        String[][] options = {
                {"A. class", "B. new", "C. object", "D. create"},
                {"A. start()", "B. run()", "C. main()", "D. execute()"},
                {"A. for", "B. while", "C. do-while", "D. enhanced for"},
                {"A. implements", "B. extends", "C. inherits", "D. super"},
                {"A. java.io", "B. java.lang", "C. java.util", "D. java.net"}
        };

        char[] answers = {'B', 'C', 'C', 'B', 'C'};

        int score = 0;

        System.out.println("===== JAVA QUIZ GAME =====\n");

        for (int i = 0; i < questions.length; i++) {

            System.out.println(questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your Answer (A/B/C/D): ");
            char answer = Character.toUpperCase(sc.next().charAt(0));

            if (answer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! Correct Answer: " + answers[i] + "\n");
            }
        }

        System.out.println("===== QUIZ COMPLETED =====");
        System.out.println("Score: " + score + " / " + questions.length);

        double percentage = (score * 100.0) / questions.length;
        System.out.printf("Percentage: %.2f%%\n", percentage);

        if (score == 5) {
            System.out.println("Excellent! Perfect Score!");
        } else if (score >= 4) {
            System.out.println("Very Good!");
        } else if (score >= 3) {
            System.out.println("Good Job!");
        } else {
            System.out.println("Keep Practicing Java!");
        }

        sc.close();
    }
}