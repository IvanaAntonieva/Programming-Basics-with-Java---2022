import java.util.Scanner;

public class TrekkingMania_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int allPeople = 0;
        int peopleMusala = 0;
        int peopleMontblan = 0;
        int peopleKilimandzharo = 0;
        int peopleK2 = 0;
        int peopleEverest = 0;
        for (int i = 1; i <= n; i++) {
            int peopleInTheGroup = Integer.parseInt(scanner.nextLine());
            allPeople = allPeople + peopleInTheGroup;
                if (peopleInTheGroup <= 5) {
                    peopleMusala = peopleMusala + peopleInTheGroup;
                } else if (peopleInTheGroup <= 12) {
                    peopleMontblan = peopleMontblan + peopleInTheGroup;
                } else if (peopleInTheGroup <= 25) {
                    peopleKilimandzharo = peopleKilimandzharo + peopleInTheGroup;
                } else if (peopleInTheGroup <= 40) {
                    peopleK2 = peopleK2 + peopleInTheGroup;
                } else {
                    peopleEverest = peopleEverest + peopleInTheGroup;
                    }
                }
            System.out.printf("%.2f%%%n", peopleMusala * 1.0 / allPeople * 100);
            System.out.printf("%.2f%%%n", peopleMontblan * 1.0 / allPeople * 100);
            System.out.printf("%.2f%%%n", peopleKilimandzharo * 1.0 / allPeople * 100);
            System.out.printf("%.2f%%%n", peopleK2 * 1.0 / allPeople * 100);
            System.out.printf("%.2f%%%n", peopleEverest * 1.0 / allPeople * 100);
    }
}
