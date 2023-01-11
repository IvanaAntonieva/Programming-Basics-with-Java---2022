import java.util.Scanner;

public class OldBooks_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String wantedBook = scanner.nextLine();
        String command = scanner.nextLine();
        int countBooks = 0;
        boolean wasFound = false;
        while (!command.equals("No More Books")) {
            String currentBook = command;

            if (wantedBook.equals(currentBook)) {
                wasFound = true;
                break;
            }

            countBooks++;
            command = scanner.nextLine();
        }

            if (wasFound) {
            System.out.printf("You checked %d books and found it.", countBooks);
            } else {
                System.out.printf("The book you search is not here!%nYou checked %d books.", countBooks);
            }
        }
    }

