import java.util.Scanner; //S is capital as it is case sensitive.

public class userinput {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // For making a Scanner of name sc.

        System.out.print("Enter The Name : ");
        String name = sc.nextLine(); // For taking input in name variable
        // Escape sequence for nextLine cmd is \n(Enter).

        System.out.print("How old are you? : ");
        int age = sc.nextInt();
        // Here escape sequence is only numbers so when you press enter the next scanner
        // will get skip
        // due to which we have to make an extra scanner for line.
        sc.nextLine();

        System.out.print("Enter The Place : ");
        String place = sc.nextLine();

        System.out.println();
        System.out.println("Hello " + name);
        System.out.println("Age is " + age);
        System.out.println("Live in " + place);

        sc.close();
    }
}
