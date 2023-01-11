import java.util.Scanner;

public class SuppliesforSchool_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Брой пакети химикали - цяло число в интервала [0...100]
        // Брой пакети маркери - цяло число в интервала [0...100]
        // Литри препарат за почистване на дъска - цяло число в интервала [0…50]
        // Процент намаление - цяло число в интервала [0...100]

        int pens = Integer.parseInt(scanner.nextLine());
        int markers = Integer.parseInt(scanner.nextLine());
        int detergent = Integer.parseInt(scanner.nextLine());
        int discountInPercents = Integer.parseInt(scanner.nextLine());
        double total = pens * 5.80 + markers * 7.20 + detergent * 1.20;
        double finalTotal = total - discountInPercents * total / 100;

        System.out.println(finalTotal);
    }
}
