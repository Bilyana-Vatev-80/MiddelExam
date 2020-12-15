import java.util.Scanner;

public class Bakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int biscuitsPerDayPerWorker = Integer.parseInt(scanner.nextLine());
        int workersCount = Integer.parseInt(scanner.nextLine());

        int competitionFactoryAmountPerMonth = Integer.parseInt(scanner.nextLine());

        int totalAmountOfBiscuitsPerMonth = (biscuitsPerDayPerWorker * workersCount * 20) + ((int) Math.floor(0.75 * (biscuitsPerDayPerWorker * workersCount * 10)));

        System.out.printf("You have produced %d biscuits for the past month.%n", totalAmountOfBiscuitsPerMonth);

        double moreBiscuits = totalAmountOfBiscuitsPerMonth - competitionFactoryAmountPerMonth;

        if (totalAmountOfBiscuitsPerMonth >= competitionFactoryAmountPerMonth) {
            System.out.printf("You produce %.2f percent more biscuits.", moreBiscuits / competitionFactoryAmountPerMonth * 100);

        } else if (competitionFactoryAmountPerMonth > totalAmountOfBiscuitsPerMonth) {
            double lessBiscuits = competitionFactoryAmountPerMonth - totalAmountOfBiscuitsPerMonth;
            System.out.printf("You produce %.2f percent less biscuits.", lessBiscuits / competitionFactoryAmountPerMonth * 100);
        }
    }
}
