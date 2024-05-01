import java.io.File;

public class p12 {
    public static void main(String[] args) {
        String fileName = "myData.csv";

        // Delete the file
        deleteFile(fileName);
    }

    public static void deleteFile(String fileName) {
        File file = new File(fileName);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.out.println("Failed to delete the file.");
            }
        } else {
            System.out.println("File does not exist.");
        }
    }
}
