import java.util.Scanner;

public class SmallShop_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String town = scanner.nextLine();

        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;

        switch (town) {
            case "Sofia":
                switch (product) {
                    case "coffee":
                        price = 0.50;
                        System.out.println(quantity * price);
                        break;
                    case "water":
                        price = 0.80;
                        System.out.println(quantity * price);
                        break;
                    case "beer":
                        price = 1.20;
                        System.out.println(quantity * price);
                        break;
                    case "sweets":
                        price = 1.45;
                        System.out.println(quantity * price);
                        break;
                    case "peanuts":
                        price = 1.60;
                        System.out.println(quantity * price);
                        break;
                }
                break;
            case "Plovdiv":
                switch (product) {
                    case "coffee":
                        price = 0.40;
                        System.out.println(quantity * price);
                        break;
                    case "water":
                        price = 0.70;
                        System.out.println(quantity * price);
                        break;
                    case "beer":
                        price = 1.15;
                        System.out.println(quantity * price);
                        break;
                    case "sweets":
                        price = 1.30;
                        System.out.println(quantity * price);
                        break;
                    case "peanuts":
                        price = 1.50;
                        System.out.println(quantity * price);
                        break;
                }
                break;
            case "Varna":
                switch (product) {
                    case "coffee":
                        price = 0.45;
                        System.out.println(quantity * price);
                        break;
                    case "water":
                        price = 0.70;
                        System.out.println(quantity * price);
                        break;
                    case "beer":
                        price = 1.10;
                        System.out.println(quantity * price);
                        break;
                    case "sweets":
                        price = 1.35;
                        System.out.println(quantity * price);
                        break;
                    case "peanuts":
                        price = 1.55;
                        System.out.println(quantity * price);
                        break;
                }
                break;
        }
    }
}
