import java.util.Scanner;

public class TimePlus15Minutes_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int timeInMinutes = hour * 60 + minutes + 15;
        int hourPlus15Minutes = timeInMinutes / 60;
        int minutesPlus15Minutes = timeInMinutes % 60;

        if (hourPlus15Minutes > 23) {
            hourPlus15Minutes = 0;
        }

        System.out.printf("%d:%02d", hourPlus15Minutes, minutesPlus15Minutes);
    }
}
