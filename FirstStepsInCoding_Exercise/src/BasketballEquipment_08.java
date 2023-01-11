import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка
        //•	Годишната такса за тренировки по баскетбол – цяло число в интервала [0… 9999]

        int annualFee = Integer.parseInt(scanner.nextLine());
        double sneakers = annualFee - 0.40 * annualFee;
        double tracksuit = sneakers - 0.20 * sneakers;
        double ball = tracksuit / 4;
        double acc = ball / 5;
        double sum = annualFee + sneakers + tracksuit + ball + acc;

        System.out.println(sum);
    }
}
