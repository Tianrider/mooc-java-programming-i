
import java.util.Scanner;
import java.util.ArrayList;

public class mainProgram {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Bird> birds = new ArrayList<>();

        int count = 0;
        while (true) {
            System.out.print("?");
            String command = scan.nextLine();

            if (command.equalsIgnoreCase("quit")) {
                break;
            } else if (command.equalsIgnoreCase("add")) {
                System.out.print("Name: ");
                String nameInput = scan.nextLine();

                System.out.print("Name in latin: ");
                String nameLatinInput = scan.nextLine();

                birds.add(new Bird(nameInput, nameLatinInput));
            } else if (command.equalsIgnoreCase("observation")) {
                System.out.print("Bird? ");
                String birdSearched = scan.nextLine();

                boolean birdFound = false;
                for (Bird bird : birds) {
                    if (bird.getName().equalsIgnoreCase(birdSearched)) {
                        birdFound = true;
                        bird.addObserved();
                    }
                }
                if (!birdFound) {
                    System.out.println("Not a bird!");
                }
            } else if (command.equalsIgnoreCase("all")) {
                for (Bird bird : birds) {
                    System.out.println(bird.getName() + " (" + bird.getLatinName() + "): " + bird.getObserved() + " observations");
                }
            } else if (command.equalsIgnoreCase("one")) {
                if (birds.isEmpty()) {
                    continue;
                } else {
                    System.out.println(birds.get(count).getName() + " (" + birds.get(count).getLatinName() + "): " + birds.get(count).getObserved() + " observations");
                    count++;
                }
            } else {
                System.out.println("Command Invalid!");
            }
        }
    }

}
