import java.util.*;

public class Loot3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] textInput = scanner.nextLine().split("\\|");
        List<String> items = new ArrayList<>(Arrays.asList(textInput));

        String input = scanner.nextLine();
        while (!input.equals("Yohoho!")) {
            String[] tokens = input.split("\\s+", 2);
            String commands = tokens[0];
            switch (commands) {
                case "Loot":
                    String[] loots = tokens[1].split(" ");
                    for (String s : loots) {
                        if (!items.contains(s)) {
                            items.add(0, s);
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(tokens[1]);
                    if (index >= 0 && index < items.size()) {
                        String remove = items.remove(index);
                        items.add(remove);
                    }
                    break;
                case "Steal":
                    int count = Integer.parseInt(tokens[1]);
                    List<String> stolen = new ArrayList<>();
                    while (stolen.size() < count && !items.isEmpty()) {
                        int lastIndex = items.size() - 1;
                        stolen.add(items.get(lastIndex));
                        items.remove(lastIndex);
                    }
                    Collections.reverse(stolen);
                    System.out.println(String.join(", ", stolen));
                    break;
            }
            input = scanner.nextLine();
        }
        int count = 0;
        double totalLength = 0;
        for (String item : items) {
            int length = item.length();
            totalLength += length;
            count++;
        }
        if (items.isEmpty()) {
            System.out.println("Failed treasure hunt.");
        } else {
            System.out.printf("Average treasure gain: %.2f pirate credits.", totalLength / count);
        }
    }
}
