import java.util.Scanner;

public class Shopping_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int processors = Integer.parseInt(scanner.nextLine());
        int rams = Integer.parseInt(scanner.nextLine());
        int videoCardsPrice = videoCards * 250;
        double processorsPrice = 0.35 * videoCardsPrice * processors;
        double ramsPrice = 0.10 * videoCardsPrice * rams;
        double total = videoCardsPrice + processorsPrice + ramsPrice;

        if (videoCards > processors) {
            total = 0.85 * total;
        }
        double difference = Math.abs(total - budget);
        if (budget >= total) {
            System.out.printf("You have %.2f leva left!", difference);
        } else {
            System.out.printf("Not enough money! You need %.2f leva more!", difference);
        }
    }
}
