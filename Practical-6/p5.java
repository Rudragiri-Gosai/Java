import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class p5 {
    public static void main(String[] args) {
        String fileName = "myFile.txt";

        // Read content from the file and display it on the console
        readAndDisplayFileContent(fileName);
    }

    public static void readAndDisplayFileContent(String fileName) {
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
