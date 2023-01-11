import java.util.Scanner;

public class NewHouse_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String flowerType = scanner.nextLine();;
        int flowerPcs = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double flowerPrice = 0.0;
        switch (flowerType) {
            case "Roses":
                flowerPrice = 5;
                if (flowerPcs > 80) {
                    flowerPrice = 0.9 * flowerPcs * flowerPrice;
                } else {
                    flowerPrice = flowerPcs * flowerPrice;
                }
                break;
            case "Dahlias":
                flowerPrice = 3.8;
                if (flowerPcs > 90) {
                    flowerPrice = 0.85 * flowerPcs * flowerPrice;
                } else {
                    flowerPrice = flowerPcs * flowerPrice;
                }
                break;
            case "Tulips":
                flowerPrice = 2.8;
                if (flowerPcs > 80) {
                    flowerPrice = 0.85 * flowerPcs * flowerPrice;
                } else {
                    flowerPrice = flowerPcs * flowerPrice;
                }
                break;
            case "Narcissus":
                flowerPrice = 3;
                if (flowerPcs < 120) {
                    flowerPrice = 1.15 * flowerPcs * flowerPrice;
                } else {
                    flowerPrice = flowerPcs * flowerPrice;
                }
                break;
            case "Gladiolus":
                flowerPrice = 2.5;
                if (flowerPcs < 80) {
                    flowerPrice = 1.2 * flowerPcs * flowerPrice;
                } else {
                    flowerPrice = flowerPcs * flowerPrice;
                }
                break;
        }
        double diff = Math.abs(budget - flowerPrice);
        if (budget >= flowerPrice) {
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", flowerPcs, flowerType, diff);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", diff);
        }
    }
}
