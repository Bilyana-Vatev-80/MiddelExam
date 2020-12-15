import java.util.Scanner;

public class Bak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberBiscuits = Integer.parseInt(scanner.nextLine());
        int countOfWorkers = Integer.parseInt(scanner.nextLine());
        int biscuitInFactory = Integer.parseInt(scanner.nextLine());
        double productionOnTheMont = 0;
        for (int i = 0; i < 30; i++) {
            if (i % 3 == 0) {
                productionOnTheMont += Math.floor(0.75 * numberBiscuits * countOfWorkers);
            } else {
                productionOnTheMont += numberBiscuits * countOfWorkers;
            }
        }
        System.out.printf("You have produced %.0f biscuits for the past month.%n", productionOnTheMont);
        double percentage = (biscuitInFactory - productionOnTheMont) / biscuitInFactory;
        if (productionOnTheMont > biscuitInFactory) {
            System.out.printf("You produce %.2f percent more biscuits.", Math.abs(percentage * 100));
        } else {
            System.out.printf("You produce %.2f percent less biscuits.", Math.abs(percentage * 100));
        }
    }
}
