import java.util.Scanner;

public class OperationsBetweenNumbers_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        double result = 0.0;
        String evenOrOdd = "";
        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                } else evenOrOdd = "odd";
                break;
            case '-':
                result = firstNumber - secondNumber;
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                } else evenOrOdd = "odd";
                break;
            case '*':
                result = firstNumber * secondNumber;
                if (result % 2 == 0) {
                    evenOrOdd = "even";
                } else evenOrOdd = "odd";
                break;
            case '/':
                if (secondNumber != 0) {
                    result = firstNumber * 1.0 / secondNumber;
                }
                break;
            case '%':
                if (secondNumber != 0) {
                    result = firstNumber % secondNumber;
                }
                break;
        }
        if (operator == '+' || operator == '-' || operator == '*') {
            System.out.printf("%d %c %d = %.0f - %s", firstNumber, operator, secondNumber, result, evenOrOdd);
        } else if (operator == '/' && secondNumber != 0) {
            System.out.printf("%d %c %d = %.2f", firstNumber, operator, secondNumber, result);
        } else if (operator == '%' && secondNumber != 0) {
            System.out.printf("%d %c %d = %.0f", firstNumber, operator, secondNumber, result);
        } else if (secondNumber == 0) {
            System.out.printf("Cannot divide %d by zero", firstNumber);
        }
    }
}
