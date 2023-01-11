import java.util.Scanner;

public class SumPrimeNonPrime_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int primeSum = 0;
        int notPrimeSum = 0;
        String input = scanner.nextLine();
        while (!input.equals("stop")) {
            int currentNum = Integer.parseInt(input);
            if (currentNum < 0) {
                System.out.println("Number is negative.");
                input = scanner.nextLine();
                continue;
            }
            int count = 0;
            for (int i = 1; i <= currentNum; i++) {
                if (currentNum % i == 0) {
                    count++;
                }
            }
                if (count == 2) {
                    primeSum += currentNum;
                } else {
                    notPrimeSum += currentNum;
                }
            input = scanner.nextLine();
        }
        System.out.println("Sum of all prime numbers is: " + primeSum);
        System.out.println("Sum of all non prime numbers is: " + notPrimeSum);
    }
}
