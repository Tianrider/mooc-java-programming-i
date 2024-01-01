
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give points[0-100]");
        int point = Integer.valueOf(scan.nextLine());
        
        if(point > 100){
            System.out.println("incredible!");
        }else if(point > 89){
            System.out.println("5");
        }else if(point > 79){
            System.out.println("4");
        }else if(point > 69){
            System.out.println("3");
        }else if(point > 59){
            System.out.println("2");
        }else if(point > 49){
            System.out.println("1");
        }else if(point >= 0){
            System.out.println("failes");
        }else{
            System.out.println("impossible!");
        }
        
    }
}
