import java.util.Scanner;

public class Histogram_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        double p1 = 0.0;
        double p2 = 0.0;
        double p3 = 0.0;
        double p4 = 0.0;
        double p5 = 0.0;
            for (int i = 1; i <= n; i++) {
            int number = Integer.parseInt(scanner.nextLine());
            if (number < 200) {
                p1 += 1;
            } else if (number <= 399) {
                p2 += 1;
            } else if (number <= 599) {
                p3 += 1;
            } else if (number <= 799) {
                p4 += 1;
            } else {
                p5 += 1;
            }
        }
            double p1Percents = p1 / n * 100;
            double p2Percents = p2 / n * 100;
            double p3Percents = p3 / n * 100;
            double p4Percents = p4 / n * 100;
            double p5Percents = p5 / n * 100;
        System.out.printf("%.2f%%%n", p1Percents);
        System.out.printf("%.2f%%%n", p2Percents);
        System.out.printf("%.2f%%%n", p3Percents);
        System.out.printf("%.2f%%%n", p4Percents);
        System.out.printf("%.2f%%%n", p5Percents);
    }
}
