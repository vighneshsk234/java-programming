public class TwoDArrayExample {

    public static void main(String[] args) {

        // 2D array already filled with data
        String[][] students = {
                {"Ram", "A", "90"},
                {"Rahul", "B", "85"},
                {"Priya", "A+", "95"}
        };

        System.out.println("Original Data:\n");

        for (String[] row : students) {
            for (String data : row) {
                System.out.print(data + "\t");
            }
            System.out.println();
        }

        // Changing a particular value
        students[1][2] = "92";      // Rahul's marks
        students[2][1] = "A";       // Priya's grade

        System.out.println("\nUpdated Data:\n");

        for (String[] row : students) {
            for (String data : row) {
                System.out.print(data + "\t");
            }
            System.out.println();
        }
    }
}