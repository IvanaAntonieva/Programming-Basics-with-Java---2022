import java.util.Scanner;

public class Traveling_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        while (!country.equals("End")) {
            double minBudget = Double.parseDouble(scanner.nextLine());
            double sum = 0;
            while (sum < minBudget) {
                double savings = Double.parseDouble(scanner.nextLine());
                sum += savings;
            }
            System.out.printf("Going to %s!%n", country);
            country = scanner.nextLine();
        }
    }
}
