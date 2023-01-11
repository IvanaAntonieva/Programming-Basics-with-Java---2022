import java.util.Scanner;

public class SkiTrip_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int nights = days - 1;
        String room = scanner.nextLine();
        String rating = scanner.nextLine();
        double bill = 0.0;

        //	"room for one person" – 18.00 лв за нощувка
        //	"apartment" – 25.00 лв за нощувка
        //	"president apartment" – 35.00 лв за нощувка

        switch (room) {
            case "room for one person":
                bill = nights * 18.0;
                break;
            case "apartment":
                if (days < 10) {
                    bill = 0.7 * nights * 25.0;
                } else if (days >= 10 && days <= 15) {
                    bill = 0.65 * nights * 25.0;
                } else {
                    bill = 0.5 * nights * 25.0;
                }
                break;
            case "president apartment":
                if (days < 10) {
                    bill = 0.9 * nights * 35.0;
                } else if (days >= 10 && days <= 15) {
                    bill = 0.85 * nights * 35.0;
                } else {
                    bill = 0.8 * nights * 35.0;
                }
                break;
        }

        switch (rating) {
            case "positive":
                bill = 1.25 * bill;
                break;
            case "negative":
                bill = 0.9 * bill;
                break;
        }
        System.out.printf("%.2f", bill);
    }
}
