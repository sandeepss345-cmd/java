import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean run = true;
        while (run) {
            try {
                System.out.print("Enter first number: ");
                double num1 = input.nextDouble();
                System.out.print("Enter operator (+, -, *, /): ");
                char op = input.next().charAt(0);
                System.out.print("Enter second number: ");
                double num2 = input.nextDouble();
                double result = 0;
                switch (op) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("Cannot divide by zero.");
                            continue;
                        }
                        result = num1 / num2;
                        break;
                    default:
                        System.out.println("Invalid operator.");
                        continue;
                }
                System.out.println("Result: " + result);
                System.out.print("Do you want to continue? (yes/no): ");
                String choice = input.next();
                if (!choice.equalsIgnoreCase("yes")) run = false;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter numbers only.");
                input.nextLine(); // clear bad input
            }
        }
        input.close();
        System.out.println("Calculator closed.");
    }
}
