import java.util.Scanner;

public class Journey_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        double tripCost = 0.0;
        if (budget <= 100) {
            destination = "Bulgaria";
            if (season.equals("summer")) {
                tripCost = 0.3 * budget;
            } else if (season.equals("winter")) {
                tripCost = 0.7 * budget;
            }
        } else if (budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                tripCost = 0.4 * budget;
            } else if (season.equals("winter")) {
                tripCost = 0.8 * budget;
            }
        } else {
            destination = "Europe";
            tripCost = 0.9 * budget;
        }
        String placeToStay = "";
        if (destination.equals("Europe") || season.equals("winter")) {
            placeToStay = "Hotel";
        } else if (season.equals("summer")) {
            placeToStay = "Camp";
        }
        System.out.printf("Somewhere in %s %n", destination);
        System.out.printf("%s - %.2f", placeToStay, tripCost);
    }
}

