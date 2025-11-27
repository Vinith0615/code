import java.util.Scanner;

public class nameToInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Read user's name
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            // Extract first 3 characters
            String firstThree = name.substring(0, 3);

            // Try to convert to integer
            int number = Integer.parseInt(firstThree);
            System.out.println("Converted number: " + number);

        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Error: Name must have at least 3 characters.");
        } catch (NumberFormatException e) {
            System.out.println("Error: First three characters are not numeric.");
        } finally {
            scanner.close();
        }
    }
}