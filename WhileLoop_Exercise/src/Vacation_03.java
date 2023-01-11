import java.util.Scanner;

public class Vacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double excursion = Double.parseDouble(scanner.nextLine());
        double money = Double.parseDouble(scanner.nextLine());

        double total = money;

        int countSpend = 0;
        boolean isFailed = false;
        int days = 0;

        while (total < excursion) {
            if (countSpend >= 5) {
                isFailed = true;
                break;
            }
            String action = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());

            days++;

            if (action.equals("spend")) {
                countSpend++;
                total = total - sum;
                if (total < 0) {
                    total = 0;
                }
                } else if (action.equals("save")) {
                countSpend = 0;
                total = total + sum;
                }
        }
        if (isFailed) {
            System.out.println("You can't save the money.");
            System.out.println(days);
        } else {
            System.out.printf("You saved the money for %d days.", days);
        }
    }
}
