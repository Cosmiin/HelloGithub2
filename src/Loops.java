import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
     /*   int x = 5;
        while (x > 0) {
            System.out.println("Cosmin");
            --x;*/

        Scanner scanner =new Scanner (System.in);// aici se introduce ideea ca se va putea introduce continut in consola;
        int x = 1;

        /*while (x > 0) {

            System.out.println(x);
            System.out.println("Echo");
            x--; */{

                while (x > 1);{
                    String y = scanner.nextLine();
                    --x;
                    StringBuilder sb = new StringBuilder(y); // Folosim String Builder pentru a construi un string ce poate fi inversat.
                System.out.println("String-ul inversat este " +sb.reverse());

            }





        }

    }
}


