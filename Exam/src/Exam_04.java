import java.util.Scanner;

public class Exam_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        double totalSells = 0;
        double allRatings = 0;

        for (int i = 1; i <= n ; i++) {
            int code = Integer.parseInt(scanner.nextLine());
            int rating = code % 10;
            int sellsPossible = code / 10;
            double sells = 0;

            if (rating == 2) {
                sells = 0;
            } else if (rating == 3) {
                sells = 0.50 * sellsPossible;
            } else if (rating == 4) {
                sells = 0.70 * sellsPossible;
            } else if (rating == 5) {
                sells = 0.85 * sellsPossible;
            } else if (rating == 6) {
                sells = 1.00 * sellsPossible;
            }

            totalSells += sells;
            allRatings += rating;
        }
        double averageRating = allRatings / n;
        System.out.printf("%.2f%n", totalSells);
        System.out.printf("%.2f", averageRating);
    }
}
