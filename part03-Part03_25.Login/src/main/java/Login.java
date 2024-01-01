
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter username:");
        String usernameInput = scanner.nextLine();
        
        System.out.println("Enter password:");
        String passwordInput = scanner.nextLine();
        
        if(usernameInput.equals("alex")){
            if(passwordInput.equals("sunshine")){
                System.out.println("You have successfully logged in!");
                return;
            }
        }else if(usernameInput.equals("emma")){
            if(passwordInput.equals("haskell")){
                System.out.println("You have successfully logged in!");
                return;
            }
        }
                
        System.out.println("Incorrect username or password!");
    }
}
