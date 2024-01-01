
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        ArrayList<Integer> list = new ArrayList<>();
        // until the user enters 9999
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 9999) {
                break;
            }
            list.add(input);
        }
        System.out.println("");

        int smallest = 9999;
        ArrayList<Integer> smallestIndex = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < smallest) {
                smallest = list.get(i);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == smallest) {
                smallestIndex.add(i);
            }
        }
        
        System.out.println("Smallest number: " + smallest);
        for (int i = 0; i < smallestIndex.size(); i++){
            System.out.println("Found at index :" + smallestIndex.get(i));
        }
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times

    }
}
