import java.util.Scanner;

public class Cinema_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movieType = scanner.nextLine();
        int rows = Integer.parseInt(scanner.nextLine());
        int columns = Integer.parseInt(scanner.nextLine());
        int seats = rows * columns;
        double price = 0.0;
        switch (movieType) {
            case "Premiere":
                price = 12;
                break;
            case "Normal":
                price = 7.5;
                break;
            case "Discount":
                price = 5;
                break;
        }
        double total = price * seats;
        System.out.printf("%.2f leva", total);
    }
}
