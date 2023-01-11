import java.util.Scanner;

public class HotelRoom_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month = scanner.nextLine();
        int overnights = Integer.parseInt(scanner.nextLine());
        double apartmentPrice = 0.0;
        double studioPrice = 0.0;
        switch (month) {
            case "May":
            case "October":
                apartmentPrice = 65;
                studioPrice = 50;
                break;
            case "June":
            case "September":
                apartmentPrice = 68.7;
                studioPrice = 75.20;
                break;
            case "July":
            case "August":
                apartmentPrice = 77;
                studioPrice = 76;
                break;
        }
        double totalApartment = overnights * apartmentPrice;
        double totalStudio = overnights * studioPrice;

        if (overnights > 7 && overnights <= 14 && (month.equals("May") || month.equals("October"))) {
            totalStudio = 0.95 * totalStudio;
        } else if (overnights > 14 && (month.equals("May") || month.equals("October"))) {
            totalStudio = 0.7 * totalStudio;
        } else if (overnights > 14 && (month.equals("June") || month.equals("September"))) {
            totalStudio = 0.8 * totalStudio;
        }

        if (overnights > 14) {
            totalApartment = 0.9 * totalApartment;
        }

        System.out.printf("Apartment: %.2f lv. %n", totalApartment);
        System.out.printf("Studio: %.2f lv.", totalStudio);
    }
}
