import java.util.Scanner;

public class ToyShop_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        •	Пъзел - 2.60 лв.
//        •	Говореща кукла - 3 лв.
//        •	Плюшено мече - 4.10 лв.
//        •	Миньон - 8.20 лв.
//        •	Камионче - 2 лв.

        double tripPrice = Double.parseDouble(scanner.nextLine());
        int puzzlePcs = Integer.parseInt(scanner.nextLine());
        int dollPcs = Integer.parseInt(scanner.nextLine());
        int teddyPcs = Integer.parseInt(scanner.nextLine());
        int minionPcs = Integer.parseInt(scanner.nextLine());
        int truckPcs = Integer.parseInt(scanner.nextLine());
        double sum = puzzlePcs * 2.60 + dollPcs * 3.0 + teddyPcs * 4.10 + minionPcs * 8.20 + truckPcs * 2.0;
        int allPcs = puzzlePcs + dollPcs + teddyPcs + minionPcs + truckPcs;

        if (allPcs >= 50) {
            sum = 0.75 * sum;
        }

        double profit = 0.90 * sum;
        double difference = Math.abs(profit - tripPrice);

        if (profit >= tripPrice) {
            System.out.printf("Yes! %.2f lv left.", difference);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", difference);
        }
    }
}
