import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class p6 {
    public static void main(String[] args) {
        String fileName = "myFile.txt";
        String newLine = "Java Programming is awesome!";

        // Append a new line to the file
        appendToFile(fileName, newLine);
    }

    public static void appendToFile(String fileName, String newLine) {
        try {
            FileWriter writer = new FileWriter(fileName, true); // Append mode
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.newLine(); // Add a new line before appending new content
            bufferWriter.write(newLine);
            bufferWriter.close();
            System.out.println("New line appended to the file successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while appending to the file: " + e.getMessage());
        }
    }
}
