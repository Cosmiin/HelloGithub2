import java.util.Scanner;

public class DoWhileEx {
    public static void main (String[]args){

        Scanner input = new Scanner (System.in);

        int x = 4;

        do {

            String y = input.nextLine();
            StringBuilder sb = new StringBuilder(y);

            System.out.println(sb.reverse());
            x--;

        }
        while (x > 0);



















    }
}
