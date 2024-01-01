
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        
        int num = Integer.valueOf(scanner.nextLine());
        int i = 1;
        int total = 1;
        while (i <= num){
            total = total * i;
            i++;
        }
        
        System.out.println("Factorial: " + total);
    }
}
