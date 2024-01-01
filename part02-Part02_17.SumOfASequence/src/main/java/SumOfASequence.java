
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Last number?");
        
        int num = Integer.valueOf(scanner.nextLine());
        int i = 1;
        int total = 0;
        while (i <= num){
            total += i;
            i++;
        }
        
        System.out.println("The sum is " + total);
    }
}
