import java.util.Scanner;

public class LunchBreak_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String tvShow = scanner.nextLine();
        int tvShowTime = Integer.parseInt(scanner.nextLine());
        int lunchBreakTime = Integer.parseInt(scanner.nextLine());
        double lunchTime = lunchBreakTime / 8.0;
        double restTime = lunchBreakTime / 4.0;
        double freeTime = lunchBreakTime - lunchTime - restTime;
        double diffrence = Math.abs(freeTime - tvShowTime);
        diffrence = Math.ceil(diffrence);
        if (freeTime >= tvShowTime) {
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time.", tvShow, diffrence);
       } else {
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes.", tvShow, diffrence);
        }
    }
}
