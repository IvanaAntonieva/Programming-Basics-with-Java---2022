import java.util.Scanner;

public class SumSeconds_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int timeFisrt = Integer.parseInt(scanner.nextLine());
        int timeSecond = Integer.parseInt(scanner.nextLine());
        int timeThird = Integer.parseInt(scanner.nextLine());
        int totalTime = timeFisrt + timeSecond + timeThird;
        int minutes = totalTime / 60;
        int seconds = totalTime % 60;
        System.out.printf("%d:%02d", minutes, seconds);
    }
}
