import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // За рождения си ден Любомир получил аквариум с формата на паралелепипед. Първоначално прочитаме от конзолата
        // на отделни редове размерите му – дължина, широчина и височина в сантиметри. Трябва да се пресметне колко литра
        // вода ще събира аквариума, ако се знае, че определен процент от вместимостта му е заета от пясък, растения,
        // нагревател и помпа.
        //Един литър вода се равнява на един кубичен дециметър/ 1л=1 дм3/.
        //Да се напише програма, която изчислява литрите вода, която са необходими за напълването на аквариума.
        // 1.	Дължина в см – цяло число в интервала [10 … 500]
        //2.	Широчина в см – цяло число в интервала [10 … 300]
        //3.	Височина в см – цяло число в интервала [10… 200]
        //4.	Процент  – реално число в интервала [0.000 … 100.000]

        int lenght = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        double capacity = lenght * width * height * 0.001;
        double liters = capacity - percent * capacity / 100.00;

        System.out.println(liters);
    }
}
