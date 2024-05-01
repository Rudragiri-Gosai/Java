import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class p1 {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String content = "This is an example text written to a file.";

        // Create a file and write content to it
        createAndWriteToFile(fileName, content);

        // Perform read operation on the file
        readFromFile(fileName);
    }

    public static void createAndWriteToFile(String fileName, String content) {
        try {
            File file = new File(fileName);
            FileWriter writer = new FileWriter(file);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(content);
            bufferWriter.close();
            System.out.println("File created and content written successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while creating or writing to the file: " + e.getMessage());
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
