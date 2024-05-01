import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class p4 {
    public static void main(String[] args) {
        String fileName = "myFile.txt";
        String content = "Hello World!";

        // Write content to the file
        writeToFile(fileName, content);
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
}
