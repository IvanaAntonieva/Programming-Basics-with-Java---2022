import java.util.Scanner;

public class Salary_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opentabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= opentabs; i++) {
            if (salary > 0) {
                String currentTab = scanner.nextLine();
                switch (currentTab) {
                    case "Facebook":
                        salary = salary - 150;
                        break;
                    case "Instagram":
                        salary = salary - 100;
                        break;
                    case "Reddit":
                        salary = salary - 50;
                        break;
                }
            }
        }
        if (salary > 0) {
            System.out.println(salary);
        } else {
            System.out.println("You have lost your salary.");
        }
    }
}