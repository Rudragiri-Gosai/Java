import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class p11 {
    public static void main(String[] args) {
        String fileName = "myData.csv";

        // Read and display content from the CSV file
        readAndDisplayCSVFileContent(fileName);
    }

    public static void readAndDisplayCSVFileContent(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);

            String line;
            System.out.println("Contents of the CSV file:");
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Error occurred while reading the CSV file: " + e.getMessage());
        }
    }
}
