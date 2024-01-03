
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Items> itemsList = new ArrayList<>();

        Items item;
        
        while (true) {
            System.out.println("Identifier?(empty will stop");
            String identifier = scanner.nextLine();
            if (identifier.isEmpty()) {
                break;
            }

            System.out.println("Name?(empty will stop)");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            item = new Items(identifier, name);
            if (!itemsList.contains(item)) {
                itemsList.add(item);
            }
        }
        
        System.out.println("==Items==");
        for (Items items : itemsList) {
            System.out.println(items.getIdentifier() + ": " + items.getName());
        }
    }
}
