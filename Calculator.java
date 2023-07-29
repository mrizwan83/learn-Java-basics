public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the Basic Calculator!");
        System.out.println("Please enter your first number: ");
        double num1 = Double.parseDouble(System.console().readLine());

        System.out.print("Please enter your second number: ");
        double num2 = Double.parseDouble(System.console().readLine());

        System.out.print("Please enter the operation you would like to perform: ");
        String op = System.console().readLine();

        switch (op) {
            case "+":
                System.out.println("The result is " + (num1 + num2));
                break;
            case "-":
                System.out.println("The result is " + (num1 - num2));
                break;
            case "*":
                System.out.println("The result is " + (num1 * num2));
                break;
            case "/":
                if (num2 != 0) {
                    System.out.println("The result is " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation entered.");
        }
    }
}