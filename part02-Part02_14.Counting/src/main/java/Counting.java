
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int num = Integer.valueOf(scanner.nextLine());
        int i = 0;
        
        while (i <= num){
            System.out.println(i);
            i++;
        }
    }
}
