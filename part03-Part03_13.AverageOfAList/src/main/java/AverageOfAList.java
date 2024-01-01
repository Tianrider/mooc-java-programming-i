
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> list = new ArrayList<>();
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1) {
                break;
            }

            list.add(input);
        }

        System.out.println("");

        // toteuta listan lukujen summan laskeminen tänne
        int total = 0;
        for (int i = 0; i < list.size(); i++){
            total += list.get(i);
        }
        
        double average = (double) total / list.size();
        
        System.out.println("Average: " + average);
        
        
    }
}
