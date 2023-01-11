import java.util.Scanner;

public class OddEvenSum_10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int oddSum = 0;
        int evenSum = 0;
        for (int i = 1; i <= n; i++) {
            int value = Integer.parseInt(scanner.nextLine());
            if (i % 2 != 0) {
                oddSum += value;
            } else {
                evenSum += value;
                }
            }
        int diff = Math.abs(oddSum - evenSum);
        if (oddSum == evenSum) {
            System.out.println("Yes");
            System.out.println("Sum = " + oddSum);
        } else {
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
    }
}
