import java.util.Scanner;

public class Graduation_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();

        double sumGrades = 0;
        int countClasses = 0;
        int countLowGrades = 0;
        while (countClasses != 12) {
            double currentgrade = Double.parseDouble(scanner.nextLine());
            sumGrades = sumGrades + currentgrade;
            countClasses++;
            if (currentgrade < 4.0) {
                countLowGrades = countClasses;
                break;
            }
        }
        double averageGrade = sumGrades / countClasses;
        if (countLowGrades >= 1) {
            System.out.printf("%s has been excluded at %d grade", studentName, countClasses);
        } else {
            System.out.printf("%s graduated. Average grade: %.2f", studentName, averageGrade);
        }
    }
}
