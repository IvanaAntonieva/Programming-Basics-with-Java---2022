import java.util.Scanner;

public class ProjectCreation_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String Architect = scanner.nextLine();
        int Projects = Integer.parseInt(scanner.nextLine());
        int Hours = Projects * 3;
        System.out.println("The architect " + Architect + " will need " + Hours + " hours to complete " + Projects + " project/s.");
    }
}
