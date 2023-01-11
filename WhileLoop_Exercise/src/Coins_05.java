import java.util.Scanner;

public class Coins_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double money = Double.parseDouble(scanner.nextLine());
        double change = money * 100;
        int count = 0;
        while (change > 0) {
            if (change >= 200) {
                change = change - 200;
                count++;
            } else if (change >= 100) {
                change = change - 100;
                count++;
            } else if (change >= 50) {
                change = change - 50;
                count++;
            } else if (change >= 20) {
                change = change - 20;
                count++;
            } else if (change >= 10) {
                change = change - 10;
                count++;
            } else if (change >= 5) {
                change = change - 5;
                count++;
            } else if (change >= 2) {
                change = change - 2;
                count++;
            } else if (change >= 1) {
                change = change - 1;
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
