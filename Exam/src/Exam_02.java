import java.util.Scanner;

public class Exam_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pocketMoneyPerDay = Double.parseDouble(scanner.nextLine());
        double profitMoneyPerDay = Double.parseDouble(scanner.nextLine());
        double costs = Double.parseDouble(scanner.nextLine());
        double presentCost = Double.parseDouble(scanner.nextLine());

        double savedPocketMoney = 5 * pocketMoneyPerDay;
        double profitMoney = 5 * profitMoneyPerDay;
        double totalSavedMoney = savedPocketMoney + profitMoney;
        double moneyWithoutTheCosts = totalSavedMoney - costs;

        double diff = Math.abs(presentCost - moneyWithoutTheCosts);

        if (moneyWithoutTheCosts >= presentCost) {
            System.out.printf("Profit: %.2f BGN, the gift has been purchased.", moneyWithoutTheCosts);
        } else {
            System.out.printf("Insufficient money: %.2f BGN.", diff);
        }
    }
}
