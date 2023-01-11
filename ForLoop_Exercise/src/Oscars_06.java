import java.util.Scanner;

public class Oscars_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String actor = scanner.nextLine();
        double initialPoints = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double totalPoints = initialPoints;

         for (int i = 1; i <= n; i++) {
             if (totalPoints < 1250.5) {
                 String jury = scanner.nextLine();
                 double juryPoints = Double.parseDouble(scanner.nextLine());
                 double currentPoints = jury.length() * juryPoints / 2;
                 totalPoints = totalPoints + currentPoints;
             }
         }
         double diff = 1250.5 - totalPoints;
         if (totalPoints >= 1250.5) {
             System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actor, totalPoints);
         } else {
             System.out.printf("Sorry, %s you need %.1f more!", actor, diff);
         }
    }
}
