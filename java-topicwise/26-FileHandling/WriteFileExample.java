import java.io.FileWriter;
import java.io.IOException;

public class WriteFileExample {

    public static void main(String[] args) {

        try {

            FileWriter writer = new FileWriter("example.txt");

            writer.write("Hello, this is my first file in Java.\n");
            writer.write("I am learning Java File Handling.\n");
            writer.write("Java is easy to learn!");

            writer.close();

            System.out.println("File written successfully.");

        } catch (IOException e) {

            System.out.println("An error occurred while writing the file.");

        }
    }
}