import java.util.Scanner;

public class Crafting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String particles = scanner.nextLine();
        String[] weaponParts = particles.split("\\|");
        int index = 0;
        String weaponName = " ";
        String input = scanner.nextLine();
        while (!input.equals("Done")) {
            String[] tokens = input.split("\\s+");
            String commands = tokens[0];
            switch (commands) {
                case "Move":
                    String direction = tokens[1];
                    index = Integer.parseInt(tokens[2]);
                    switch (direction) {
                        case "Left":
                            if (index > 0 && index < weaponParts.length) {
                                String currentIndex = weaponParts[index];
                                String leftIndex = weaponParts[index - 1];
                                weaponParts[index - 1] = currentIndex;
                                weaponParts[index] = leftIndex;
                            }
                            break;
                        case "Right":
                            if (index >= 0 && index < weaponParts.length) {
                                String currentIndex = weaponParts[index];
                                String rightIndex = weaponParts[index + 1];
                                weaponParts[index] = rightIndex;
                                weaponParts[index + 1] = currentIndex;
                            }
                            break;
                    }
                    break;
                case "Check":
                    String number = tokens[1];
                    switch (number) {
                        case "Even":
                            for (int i = 0; i < weaponParts.length; i++) {
                                if (i % 2 == 0) {
                                    System.out.print(weaponParts[i] + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "Odd":
                            for (int i = 0; i < weaponParts.length; i++) {
                                if (i % 2 == 1) {
                                    System.out.print(weaponParts[i] + " ");
                                }
                            }
                            System.out.println();
                            break;
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (String s : weaponParts) {
            weaponName += s;
        }
        System.out.printf("You crafted %s!", weaponName);
    }
}
