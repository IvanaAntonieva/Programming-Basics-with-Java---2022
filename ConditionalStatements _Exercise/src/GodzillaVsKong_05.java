import java.util.Scanner;

public class GodzillaVsKong_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int cast = Integer.parseInt(scanner.nextLine());
        double clothesPerOne = Double.parseDouble(scanner.nextLine());
        double decor = 0.1 * budget;
        double clothes = cast * clothesPerOne;
        if (cast >= 150) {
            clothes = 0.9 * clothes;
        }
        double total = decor + clothes;
        double difference = Math.abs(total - budget);
        if (total <= budget) {
            System.out.printf("Action! %nWingard starts filming with %.2f leva left.", difference);
        } else {
            System.out.printf("Not enough money! %nWingard needs %.2f leva more.", difference);
        }
    }
}
