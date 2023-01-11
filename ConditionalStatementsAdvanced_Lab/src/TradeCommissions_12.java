import java.util.Scanner;

public class TradeCommissions_12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Напишете конзолна програма, която чете име на град (текст) и обем на продажби (реално число) , въведени от
        // потребителя, и изчислява и извежда размера на търговската комисионна според горната таблица. Резултатът да
        // се изведе форматиран до 2 цифри след десетичната точка. При невалиден град или обем на продажбите
        // (отрицателно число) да се отпечата "error".
        String city = scanner.nextLine();
        double s = Double.parseDouble(scanner.nextLine());
        double comission = 0.0;
        switch (city) {
            case "Sofia":
                if (s >= 0 && s <= 500) {
                comission = 0.05 * s;
                    System.out.printf("%.2f", comission);
                } else if (s >= 500 && s <= 1000) {
                    comission = 0.07 * s;
                    System.out.printf("%.2f", comission);
                } else if (s >= 1000 && s <= 10000) {
                    comission = 0.08 * s;
                    System.out.printf("%.2f", comission);
                } else if (s >= 10000) {
                    comission = 0.12 * s;
                    System.out.printf("%.2f", comission);
                } else {
                    System.out.println("error");
                }
                break;
            case "Varna":
                if (s >= 0 && s <= 500) {
                    comission = 0.045 * s;
                    System.out.printf("%.2f", comission);
                } else if (s >= 500 && s <= 1000) {
                    comission = 0.075 * s;
                    System.out.printf("%.2f", comission);
                } else if (s >= 1000 && s <= 10000) {
                    comission = 0.10 * s;
                    System.out.printf("%.2f", comission);
                } else if (s >= 10000) {
                    comission = 0.13 * s;
                    System.out.printf("%.2f", comission);
                } else {
                    System.out.println("error");
                }
                break;
            case "Plovdiv":
                if (s >= 0 && s <= 500) {
                    comission = 0.055 * s;
                    System.out.printf("%.2f", comission);
                } else if (s >= 500 && s <= 1000) {
                    comission = 0.08 * s;
                    System.out.printf("%.2f", comission);
                } else if (s >= 1000 && s <= 10000) {
                    comission = 0.12 * s;
                    System.out.printf("%.2f", comission);
                } else if (s >= 10000) {
                    comission = 0.145 * s;
                    System.out.printf("%.2f", comission);
                } else {
                    System.out.println("error");
                }
                break;
            default: {
                System.out.println("error");
            }
        }
    }
}
