
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());
            if (num > 0) {
                sum = sum + num;
                count = count + 1;
            } else if (num == 0) {
                break;
            }
        }

        double avrg = (double) sum / count;
        if (count != 0) {
            System.out.println(avrg);
        }else{
            System.out.println("Cannot calculate the average");
        }
    }
}
