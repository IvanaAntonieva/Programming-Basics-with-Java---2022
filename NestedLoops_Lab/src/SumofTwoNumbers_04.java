import java.util.Scanner;

public class SumofTwoNumbers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startInterval = Integer.parseInt(scanner.nextLine());
        int endInterval = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int count = 0;
        for (int x = startInterval; x <= endInterval; x++) {
            for (int y = startInterval; y <= endInterval; y++) {
                int sum = x + y;
                count++;
                if (sum == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", count, x, y, sum);
                    return;
                }
            }
        }
        System.out.printf("%d combinations - neither equals %d%n", count, magicNumber);
    }
}
