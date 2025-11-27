import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readFileExample {
    public static void main(String[] args) {
        String filePath = "example.txt";  // Replace with your file path

        BufferedReader reader = null;

        try {
            reader = new BufferedReader(new FileReader(filePath));
            String firstLine = reader.readLine();
            System.out.println("First line: " + firstLine);
        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found - " + filePath);
        } catch (IOException e) {
            System.out.println("Error reading the file.");
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing the file.");
            }
        }
    }
}