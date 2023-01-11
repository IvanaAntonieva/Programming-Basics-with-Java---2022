import java.util.Scanner;

public class PetShop_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberDogPackages = Integer.parseInt(scanner.nextLine());
        int numberCatPackages = Integer.parseInt(scanner.nextLine());
        double sum = numberDogPackages * 2.50 + numberCatPackages * 4.00;

        System.out.println(sum + " lv.");
    }
}
