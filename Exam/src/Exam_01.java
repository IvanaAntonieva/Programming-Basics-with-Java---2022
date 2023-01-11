import java.util.Scanner;

public class Exam_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fatPercents = Integer.parseInt(scanner.nextLine());
        int proteinPercents = Integer.parseInt(scanner.nextLine());
        int carbohydratePerecent = Integer.parseInt(scanner.nextLine());
        int totalCalories = Integer.parseInt(scanner.nextLine());
        int waterPerecent = Integer.parseInt(scanner.nextLine());

        double fatTotalGrams = fatPercents * 1.0 / 100 * totalCalories / 9;
        double proteinTotalGrams = proteinPercents * 1.0 / 100 * totalCalories / 4;
        double carbohydrateTotalGrams = carbohydratePerecent * 1.0 / 100 * totalCalories / 4;
        double foodTotalGrams = fatTotalGrams + proteinTotalGrams + carbohydrateTotalGrams;
        double oneGramFoodCalories = totalCalories / foodTotalGrams;
        double calories = (100 - waterPerecent * 1.0) / 100 * oneGramFoodCalories;

        System.out.printf("%.4f", calories);
    }
}
