import java.util.Scanner;

public class dynamicArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Read array size from user
            System.out.print("Enter the size of the array: ");
            int size = scanner.nextInt();

            // Attempt to create the array
            int[] arr = new int[size];
            System.out.println("Array of size " + size + " created successfully.");
        } catch (NegativeArraySizeException e) {
            System.out.println("Error: Array size cannot be negative.");
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } finally {
            scanner.close();
        }
    }
}