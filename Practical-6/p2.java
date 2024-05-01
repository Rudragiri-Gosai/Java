import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class p2 {
    public static void main(String[] args) {
        String fileName = "output.txt";
        String content = "This is the content that will be written to the file.";

        // Perform write operation on the file
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
