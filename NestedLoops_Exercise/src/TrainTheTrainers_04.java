import java.util.Scanner;

public class TrainTheTrainers_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int count = 0;
        double allGrades = 0;

        String input = scanner.nextLine();
        while (!input.equals("Finish")) {
            String currentPresentation = input;

            double sumCurrentPresentation = 0;
            for (int i = 1; i <= n; i++) {
                double currentGrade = Double.parseDouble(scanner.nextLine());
                count++;
                sumCurrentPresentation += currentGrade;
            }

            allGrades += sumCurrentPresentation;
            double averageGradeCurrentGrade = sumCurrentPresentation / n;

            System.out.printf("%s - %.2f.%n", currentPresentation, averageGradeCurrentGrade);

            input = scanner.nextLine();
        }

        double averageGrade = allGrades / count;
        System.out.printf("Student's final assessment is %.2f.", averageGrade);
    }
}
