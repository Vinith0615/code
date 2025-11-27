
import java.util.Scanner;

public class emailValidator {
    // Method to validate email
    public static void validateEmail(String email) throws InvalidEmailException {
        if (!email.contains("@")) {
            throw new InvalidEmailException("Invalid email: '@' symbol is missing.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String userEmail = scanner.nextLine();

        try {
            validateEmail(userEmail);
            System.out.println("Email is valid.");
        } catch (InvalidEmailException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}