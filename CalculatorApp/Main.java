
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.println("===== JAVA CALCULATOR =====");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");

        System.out.print("Choose operation: ");
        int choice = sc.nextInt();

        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        Operation operation = null;

        switch (choice) {
            case 1:
                operation = new Addition();
                break;

            case 2:
                operation = new Subtraction();
                break;

            case 3:
                operation = new Multiplication();
                break;

            case 4:
                operation = new Division();
                break;

            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        try {
            double result = calculator.calculate(operation, a, b);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

