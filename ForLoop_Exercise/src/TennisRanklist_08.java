import java.util.Scanner;

public class TennisRanklist_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournaments = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());
        int finalPoints = 0;
        int totalPoints = 0;
        int wins = 0;

        for (int i = 1; i <= tournaments; i++) {
            String result = scanner.nextLine();

            switch (result) {
                case "W":
                    wins += 1;
                    finalPoints = finalPoints + 2000;
                    totalPoints = initialPoints + finalPoints;
                    break;
                case "F":
                    finalPoints = finalPoints + 1200;
                    totalPoints = initialPoints + finalPoints;
                    break;
                case "SF":
                    finalPoints = finalPoints + 720;
                    totalPoints = initialPoints + finalPoints;
                    break;
            }
        }
        double winsPercent = wins * 1.0 / tournaments * 100;
        int averagePoints = finalPoints / tournaments;
        System.out.printf("Final points: %d%n", totalPoints);
        System.out.printf("Average points: %d%n", averagePoints);
        System.out.printf("%.2f%%", winsPercent);
    }
}
