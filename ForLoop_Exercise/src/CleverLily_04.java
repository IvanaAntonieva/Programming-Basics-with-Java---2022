import java.util.Scanner;

public class CleverLily_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ageLily = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());
        int toyNumber = 0;
        int money = 0;
        int allMoney = 0;
        int brother = 0;

        for (int i = 1; i <= ageLily; i++) {
            if (i % 2 != 0) {
                toyNumber++;
            } else {
                money += 10;
                allMoney = allMoney + money;
                brother++;
            }
        }
        int piggyBank = toyNumber * toyPrice + allMoney - brother;
        double diff = Math.abs(piggyBank - washingMachinePrice);
        if (piggyBank >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }
    }
}
