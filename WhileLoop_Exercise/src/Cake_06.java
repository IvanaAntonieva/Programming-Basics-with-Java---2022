import java.util.Scanner;

public class Cake_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int lenght = Integer.parseInt(scanner.nextLine());
        int pieces = width * lenght;
        String command = scanner.nextLine();
        while (!command.equals("STOP")) {
            int currentPieces = Integer.parseInt(command);
            pieces = pieces - currentPieces;
            if (pieces <= 0) {
                break;
            }
            command = scanner.nextLine();
        }
        if (pieces <= 0) {
            System.out.printf("No more cake left! You need %d pieces more.", Math.abs(pieces));
        } else {
            System.out.printf("%d pieces are left.", pieces);
        }
    }
}
