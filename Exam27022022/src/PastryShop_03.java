import java.util.Scanner;

public class PastryShop_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String dessertType = scanner.nextLine();
        int dessertPcs = Integer.parseInt(scanner.nextLine());
        int orderDay = Integer.parseInt(scanner.nextLine());
        double dessertPrice = 0;

        if (orderDay <= 15) {
            switch (dessertType) {
                case "Cake":
                    dessertPrice = 24.0;
                    break;
                case "Souffle":
                    dessertPrice = 6.66;
                    break;
                case "Baklava":
                    dessertPrice = 12.60;
                    break;
            }
        } else {
            switch (dessertType) {
                case "Cake":
                    dessertPrice = 28.70;
                    break;
                case "Souffle":
                    dessertPrice = 9.80;
                    break;
                case "Baklava":
                    dessertPrice = 16.98;
                    break;
            }
        }
        double total = dessertPcs * dessertPrice;
        double discount = 0;
        if (orderDay <= 22) {
            if (total > 200) {
            discount = 0.25;
            } else if (total >= 100) {
            discount = 0.15;
        }
    }
    double bill = total - discount * total;
    double secondDiscount = 0;
        if (orderDay <= 15) {
            secondDiscount = 0.10;
        } else {
            secondDiscount = 0;
        }
        double finalBill = bill - secondDiscount * bill;
        System.out.printf("%.2f", finalBill);
    }
}
