
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;
        while(true){
            System.out.println("Shall we carry on?");
            text = scanner.nextLine();
            if (text.equals("no")){
                break;
            }
        }
    }
}
