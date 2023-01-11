import java.util.Scanner;

public class Walking_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int targetSteps = 10000;
        int sumSteps = 0;
        while (!command.equals("Going home")) {
            int currentSteps = Integer.parseInt(command);
            sumSteps = sumSteps + currentSteps;
            if (sumSteps >= targetSteps) {
                break;
            }
            command = scanner.nextLine();
        }
        if (command.equals("Going home")) {
            int stepsHome = Integer.parseInt(scanner.nextLine());
            sumSteps = sumSteps + stepsHome;
            }

        int diff = Math.abs(targetSteps - sumSteps);
        if (sumSteps >= targetSteps) {
            System.out.println("Goal reached! Good job!");
            System.out.printf("%d steps over the goal!", diff);
        } else {
            System.out.printf("%d more steps to reach goal.", diff);
        }
    }
}
