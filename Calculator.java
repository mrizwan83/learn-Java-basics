import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        // Welcome message
        System.out.println("Welcome to the Advanced Calculator!");
        Scanner scanner = new Scanner(System.in);

        try {
            // Read the first number from the user
            System.out.print("Please enter your first number: ");
            double num1 = Double.parseDouble(scanner.nextLine());

            // Read the second number from the user
            System.out.print("Please enter your second number: ");
            double num2 = Double.parseDouble(scanner.nextLine());

            // Read the operation from the user
            System.out.print("Please enter the operation you would like to perform: ");
            String op = scanner.nextLine();

            // Switch statement based on the operation selected by the user
            switch (op) {
                // Addition
                case "+":
                    System.out.println("The result is " + (num1 + num2));
                    break;
                // Subtraction
                case "-":
                    System.out.println("The result is " + (num1 - num2));
                    break;
                // Multiplication
                case "*":
                    System.out.println("The result is " + (num1 * num2));
                    break;
                // Division
                case "/":
                    // Check if the divisor is zero
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero.");
                    } else {
                        System.out.println("The result is " + (num1 / num2));
                    }
                    break;
                // Invalid operation
                default:
                    System.out.println("Invalid operation entered.");
            }
        } finally {
            scanner.close(); // Close the Scanner after using it.
        }
    }
}
