import java.util.Scanner;

public class CinemaTickets_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int standard = 0;
        int student = 0;
        int kid = 0;
        int count = 0;

        String movie = scanner.nextLine();
        while (!movie.equals("Finish")) {
            int seats = Integer.parseInt(scanner.nextLine());
            int currentCount = 0;

            String ticketType = scanner.nextLine();
            while (!ticketType.equals("End")) {
                currentCount++;
                count++;

              switch (ticketType) {
                    case "standard":
                        standard++;
                        break;
                    case "student":
                        student++;
                        break;
                   case "kid":
                        kid++;
                        break;
                }
                if (seats <= currentCount) {
                    break;
                }
                ticketType = scanner.nextLine();
            }
            System.out.printf("%s - %.2f%% full.%n", movie, currentCount * 1.0 / seats * 100);
            movie = scanner.nextLine();
        }
        System.out.printf("Total tickets: %d%n", count);
        System.out.printf("%.2f%% student tickets.%n", student * 1.0 / count * 100);
        System.out.printf("%.2f%% standard tickets.%n", standard * 1.0 / count * 100);
        System.out.printf("%.2f%% kids tickets.%n", kid * 1.0 / count * 100);
    }
}
