import java.util.Scanner;

public class FishingBoat_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int fishermen = Integer.parseInt(scanner.nextLine());
        double boatPrice = 0.0;
        switch (season) {
            case "Spring":
                boatPrice = 3000;
                break;
            case "Summer":
            case "Autumn":
                boatPrice = 4200;
                break;
            case "Winter":
                boatPrice = 2600;
                break;
        }
        if (fishermen <= 6) {
            boatPrice = 0.9 * boatPrice;
        } else if (fishermen <= 11) {
            boatPrice = 0.85 * boatPrice;
        } else {
            boatPrice = 0.75 * boatPrice;
        }
        boolean isValid = season.equals("Autumn");
        if (fishermen % 2 == 0 && !isValid) {
            boatPrice = 0.95 * boatPrice;
        }
        double diff = Math.abs(budget - boatPrice);
        if (budget >= boatPrice) {
            System.out.printf("Yes! You have %.2f leva left.", diff);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
