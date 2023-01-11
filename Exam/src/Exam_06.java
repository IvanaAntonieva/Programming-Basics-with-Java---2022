import java.util.Scanner;

public class Exam_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        int firstNumber = number % 10;
        int secondNumber = number / 10 % 10;
        int thirdNumber = number / 100;
        int result = 0;

        for (int i = 1; i <= firstNumber; i++) {
            for (int j = 1; j <= secondNumber ; j++) {
                for (int k = 1; k <= thirdNumber ; k++) {
                    result = i * j * k;
                    System.out.printf("%d * %d * %d = %d;%n", i, j, k, result);
                }
            }
        }
    }
}
