import java.util.Scanner;

public class LeftAndRightSum_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int half = Integer.parseInt(scanner.nextLine());
        int n = half * 2;
        int left = 0;
        int right = 0;
         for (int i = 1; i <= half; i++) {
            int leftNumber = Integer.parseInt(scanner.nextLine());
            left += leftNumber;

        }
        for (int i = half + 1; i <= n; i++) {
            int rightNumber = Integer.parseInt(scanner.nextLine());
            right += rightNumber;

        }
        int diff = Math.abs(left - right);
        if (left == right) {
            System.out.println("Yes, sum = " + left);
        } else {
            System.out.println("No, diff = " + diff);
        }
    }
}
