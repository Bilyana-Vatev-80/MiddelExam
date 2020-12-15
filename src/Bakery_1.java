import java.util.Scanner;

public class Bakery_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biscuitsDay = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());
        int competingFactory30 = Integer.parseInt(scanner.nextLine());
        double thirdsD = 0;
        double productionOfMonth = 0;
        for (int i = 1; i <= 30; i++) {
            if (i % 3 == 0) {
                productionOfMonth += Math.floor(0.75 * biscuitsDay * workers);
            } else {
                productionOfMonth += biscuitsDay * workers;
            }
        }


        System.out.printf("You have produced %.0f biscuits for the past month.", productionOfMonth);
        System.out.println();

        if (productionOfMonth > competingFactory30) {
            double percentage = 0.0;
            percentage = (productionOfMonth - competingFactory30) / competingFactory30;
            percentage *= 100;
            System.out.printf("You produce %.2f percent more biscuits.", Math.abs(percentage));
        } else {
            double percentage = 0.0;
            percentage = (productionOfMonth - competingFactory30) / competingFactory30;
            percentage *= 100;
            System.out.printf("You produce %.2f percent less biscuits.", Math.abs(percentage));
        }
    }
}
