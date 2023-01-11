import java.util.Scanner;

public class YardGreening_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double area = Double.parseDouble(scanner.nextLine());
        double price = area * 7.61;
        double discount = 0.18 * price;
        double finalPrice = price - discount;

        // "The final price is: {крайна цена на услугата} lv."
        // "The discount is: {отстъпка} lv."

        System.out.printf("The final price is: %.2f lv.%n", finalPrice);
        System.out.printf("The discount is: %.2f lv.", discount);

    }
}
