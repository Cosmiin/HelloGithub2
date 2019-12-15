import java.sql.SQLOutput;
import java.util.Scanner;

public class Switch {
    public static void main (String[]args){
        Scanner scanner = new Scanner (System.in);
        int input = scanner.nextInt();
        switch (input){
            case 0:
                System.out.println("*");
                break;
            case 1:
                System.out.println("$");
                break;
            case 2:
                System.out.println("#");
                break;
            case 3:
                System.out.println("^_^");

                break;
            case 4:
                System.out.println("#_#");
                break;
            case 5:
                System.out.println("&_&");
                break;
            default:
                System.out.println("Keep trying...");
                break;

        }


    }
}
