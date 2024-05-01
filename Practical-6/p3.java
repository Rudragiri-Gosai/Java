import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class p3 {
    public static void main(String[] args) {
        String fileName = "example1.txt";
        String content = "This is the initial content of the file.";

        // Create and write content to the file
        writeToFile(fileName, content);

        // Modify the file content
        String newContent = "This is the modified content of the file.";
        modifyFileContent(fileName, newContent);

        // Read the file content
        readFromFile(fileName);
    }

    public static void writeToFile(String fileName, String content) {
        try {
            File file = new File(fileName);
            FileWriter writer = new FileWriter(file);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(content);
            bufferWriter.close();
            System.out.println("Content written to the file successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while writing to the file: " + e.getMessage());
        }
    }

    public static void modifyFileContent(String fileName, String newContent) {
        try {
            File file = new File(fileName);
            FileWriter writer = new FileWriter(file, true); // Append mode
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.newLine(); // Add a new line before appending new content
            bufferWriter.write(newContent);
            bufferWriter.close();
            System.out.println("Content modified in the file successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while modifying the file: " + e.getMessage());
        }
    }

    public static void readFromFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            System.out.println("Contents of the file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error occurred while reading the file: " + e.getMessage());
        }
    }
}
