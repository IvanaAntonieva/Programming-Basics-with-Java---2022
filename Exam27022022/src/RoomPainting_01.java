import java.util.Scanner;

public class RoomPainting_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int paint = Integer.parseInt(scanner.nextLine());
        int wallpapers = Integer.parseInt(scanner.nextLine());
        double glovesPrice = Double.parseDouble(scanner.nextLine());
        double brushPrice = Double.parseDouble(scanner.nextLine());

        double allPaint = paint * 21.50;
        double allWallpapers = wallpapers * 5.20;
        double glovesPcs = Math.ceil(0.35 * wallpapers);
        double brushesPcs = Math.floor(0.48*paint);
        double allGloves = glovesPrice * glovesPcs;
        double allBrushes = brushPrice * brushesPcs;
        double total = allPaint + allWallpapers + allGloves + allBrushes;
        double delivery = total / 15;

        System.out.printf("This delivery will cost %.2f lv.", delivery);
    }
}
