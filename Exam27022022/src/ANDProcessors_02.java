import java.util.Scanner;

public class ANDProcessors_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int processorsPcs = Integer.parseInt(scanner.nextLine());
        int employeesPcs = Integer.parseInt(scanner.nextLine());
        int workDays = Integer.parseInt(scanner.nextLine());

        int workHours = employeesPcs * workDays * 8;
        double processorsMade = Math.floor(workHours/3.0);
        double diffInPcs = Math.abs(processorsMade - processorsPcs);
        double diffInMoney = diffInPcs * 110.10;

        if (processorsMade < processorsPcs) {
            System.out.printf("Losses: -> %.2f BGN", diffInMoney);
        } else {
            System.out.printf("Profit: -> %.2f BGN", diffInMoney);
        }
    }
}
