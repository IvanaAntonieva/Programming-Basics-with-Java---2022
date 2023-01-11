import java.util.Scanner;

public class RadianstoDegrees_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Напишете програма, която чете ъгъл в радиани (десетично число) и го преобразува в градуси.
        // Използвайте формулата: градус = радиан * 180 / π. Числото π в Java програми е достъпно чрез Math.PI.

        double rad = Double.parseDouble(scanner.nextLine());
        double deg = rad * 180 / Math.PI;

        System.out.println(deg);
    }
}
