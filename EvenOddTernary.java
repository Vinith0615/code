import java.util.Scanner;

public class EvenOddTernary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number from user
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Use ternary operator to check even or odd
        String result = (num % 2 == 0) ? "Even" : "Odd";

        // Display result
        System.out.println("The number is " + result);

        sc.close();
    }
}