import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileExample {

    public static void main(String[] args) {

        try {

            File file = new File("example.txt");
            Scanner reader = new Scanner(file);

            System.out.println("File Contents:\n");

            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }

            reader.close();

        } catch (FileNotFoundException e) {

            System.out.println("File not found.");

        }
    }
}