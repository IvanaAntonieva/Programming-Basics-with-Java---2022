import java.util.Scanner;

public class Exam_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = 1;
        int totalMeters = 0;

        String input = scanner.nextLine();
        while (!input.equals("END")) {
            String sleep = input;
            int currentMeters = Integer.parseInt(scanner.nextLine());
            totalMeters += currentMeters;
            if (sleep.equals("Yes")) {
                days++;
            }
            if (days >= 5) {
                break;
            }
            if (totalMeters >= 3484) {
                break;
            }
            input = scanner.nextLine();
        }
            if (totalMeters >= 3484) {
                System.out.printf("Goal reached for %d days!", days);
            } else {
                System.out.println("Failed!");
                System.out.printf("%d", totalMeters + 5364);
            }
        }
    }

