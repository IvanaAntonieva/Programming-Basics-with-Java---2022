import java.util.Scanner;

public class Exam_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String type = scanner.nextLine();
        String grade = scanner.nextLine();

        int nights = days - 1;

        double result = 0;
        if (type.equals("room for one person")) {
            result = nights * 18;
        } else if (type.equals("apartment")) {
            result = nights * 25;

            if (days < 10) {
                result = 0.7 * result;
            } else if (days < 15) {
                result = 0.65 * result;
            } else if (days > 15) {
                result = 0.5 * result;
            }

        } else if (type.equals("president apartment")) {
            result = nights * 35;

            if (days < 10) {
                result = 0.9 * result;
            } else if (days < 15) {
                result = 0.85 * result;
            } else if (days > 15) {
                result = 0.8 * result;
            }
        }
        if (grade.equals("positive")) {
            result = 1.25 * result;
        } else {
            result = 0.9 * result;
        }
        System.out.printf("%.2f", result);
    }
}
