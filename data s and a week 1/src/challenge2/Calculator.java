package challenge2;
import java.util.Scanner;

public class Calculator {
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double result = 0;
       boolean firstInput = true;
        String operator = "";

        System.out.println("Welcome to the calculator!");

        while (true) {
            System.out.print("> ");

            String input = scanner.nextLine();

            if (input.equals("=")) {
                System.out.println(result);
                break;
            } else if (isOperator(input)) {
                operator = input;
            } else {
                double value = Double.parseDouble(input);

                if (firstInput) {
                    result = value;
                    firstInput = false;
                } else {
                    result = calculate(result, value, operator);
                }

                System.out.println(result);
            }
        }

        scanner.close();
    }

    private static boolean isOperator(String input) {
        return input.equals("+") || input.equals("-") || input.equals("*") || input.equals("/");
    }

    private static double calculate(double a, double b, String operator) {
        switch (operator) {
            case "+":
                return a + b;
            case "-":
                return a - b;
            case "*":
                return a * b;
            case "/":
                return a / b;
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
