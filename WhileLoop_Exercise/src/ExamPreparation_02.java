import java.util.Scanner;

public class ExamPreparation_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxPoorGrades = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        int countProblems = 0;
        double totalGrades = 0;
        String lastProblem = "";
        int poorGrades = 0;

        while (!command.equals("Enough")) {
            String problemName = command;
            int grade = Integer.parseInt(scanner.nextLine());

            if (grade <= 4) {
                poorGrades++;
            }
            if (poorGrades >= maxPoorGrades) {
                break;
            }

            countProblems++;
            totalGrades = totalGrades + grade;
            lastProblem = problemName;

            command = scanner.nextLine();
        }

        if (poorGrades >= maxPoorGrades) {
            System.out.printf("You need a break, %d poor grades.", poorGrades);
        } else {
            System.out.printf("Average score: %.2f%n", totalGrades / countProblems);
            System.out.printf("Number of problems: %d%n", countProblems);
            System.out.printf("Last problem: %s", lastProblem);
        }
    }
}
