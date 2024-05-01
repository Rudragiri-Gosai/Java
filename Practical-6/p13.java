import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class p13 {
    public static void main(String[] args) {
        String sourceFileName = "myFile.txt";
        String destinationDirectoryName = "myDirectory";

        // Create the destination directory
        createDirectory(destinationDirectoryName);

        // Move the file to the destination directory
        moveFile(sourceFileName, destinationDirectoryName);
    }

    public static void createDirectory(String directoryName) {
        File directory = new File(directoryName);
        if (!directory.exists()) {
            if (directory.mkdir()) {
                System.out.println("Directory created successfully.");
            } else {
                System.out.println("Failed to create the directory.");
            }
        } else {
            System.out.println("Directory already exists.");
        }
    }

    public static void moveFile(String sourceFileName, String destinationDirectoryName) {
        Path sourcePath = new File(sourceFileName).toPath();
        Path destinationPath = new File(destinationDirectoryName + File.separator + sourceFileName).toPath();
        try {
            Files.move(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully to the destination directory.");
        } catch (IOException e) {
            System.out.println("Error occurred while moving the file: " + e.getMessage());
        }
    }
}
