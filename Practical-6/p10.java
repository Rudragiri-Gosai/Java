import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class p10 {
    public static void main(String[] args) {
        String fileName = "myData.csv";
        String targetName = "David Lee";
        String newAge = "21";

        // Update the age of David Lee in the CSV file
        updateCSVFile(fileName, targetName, newAge);
    }

    public static void updateCSVFile(String fileName, String targetName, String newAge) {
        try {
            FileReader reader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(reader);

            StringBuilder content = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                if (line.startsWith(targetName)) {
                    // Update the age of David Lee
                    String[] parts = line.split(",");
                    if (parts.length == 3) {
                        parts[1] = newAge;
                        line = String.join(",", parts);
                    }
                }
                content.append(line).append("\n");
            }

            bufferedReader.close();

            // Write the modified content back to the file
            FileWriter writer = new FileWriter(fileName);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(content.toString());
            bufferWriter.close();

            System.out.println("Age updated successfully in the CSV file.");
        } catch (IOException e) {
            System.out.println("Error occurred while updating the CSV file: " + e.getMessage());
        }
    }
}
