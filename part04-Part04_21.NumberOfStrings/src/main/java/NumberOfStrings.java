
import java.util.Scanner;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        while (true) {
            String line = scanner.nextLine();

            if (line.equals("end")) {
                break;
            }
            
            int number = Integer.valueOf(line);
            System.out.println(number * number * number);
            // add the read line to a list for later
            // handling or handle the line immediately

        }
    }
}
