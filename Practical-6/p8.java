import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class p8 {
    public static void main(String[] args) {
        String fileName = "myData.csv";
        String[] data = {
            "Name, Age, Gender",
            "John Doe, 25, Male",
            "John Smith, 30, Female",
            "David Lee, 20, Male"
        };

        // Write data to the CSV file
        writeCSVFile(fileName, data);
    }

    public static void writeCSVFile(String fileName, String[] data) {
        try {
            FileWriter writer = new FileWriter(fileName);
            BufferedWriter bufferWriter = new BufferedWriter(writer);

            for (String line : data) {
                bufferWriter.write(line);
                bufferWriter.newLine();
            }

            bufferWriter.close();
            System.out.println("Data written to the CSV file successfully.");
        } catch (IOException e) {
            System.out.println("Error occurred while writing to the CSV file: " + e.getMessage());
        }
    }
}
