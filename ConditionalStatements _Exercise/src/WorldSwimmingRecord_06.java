import java.util.Scanner;

public class WorldSwimmingRecord_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double worldSwimmingRecord = Double.parseDouble(scanner.nextLine());
        double distance = Double.parseDouble(scanner.nextLine());
        double timePerMeter = Double.parseDouble(scanner.nextLine());
        double delay = Math.floor(distance / 15.0);
        double resistance = delay * 12.5;
        double ivanRecord = distance * timePerMeter + resistance;
        double difference = Math.abs(worldSwimmingRecord - ivanRecord);
        if (ivanRecord < worldSwimmingRecord) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", ivanRecord);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", difference);
        }
    }
}
