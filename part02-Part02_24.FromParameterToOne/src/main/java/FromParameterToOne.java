

public class FromParameterToOne {

    public static void main(String[] args) {
        printFromNumberToOne(5);

    }

    public static void printFromNumberToOne(int number){
        while (true){
            if(number == 0){
                break;
            }
            System.out.println(number);
            number--;
        }
    }
}
