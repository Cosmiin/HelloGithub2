import java.sql.SQLOutput;
import java.util.Scanner;

public class AgeExercise {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        /*int age = scanner.nextInt();


        if (age == 0){
        System.out.println("*");
    }else if (age==1){
            System.out.println("$");
            System.out.println("@");
        }
        } else if (age == 2){
        else if (age == 3) {
            System.out.println("#");
        }else if (age == 4) {
            System.out.println("%");
        }else if (age == 5){
            System.out.println("^_^");
            } else {
            System.out.println("Hello, we are done here");
        }*/

        String word = scanner.nextLine();
        if (word.equals("Star")) {
            System.out.println("*");
        } else if (word.equals("Dollar")) {
            System.out.println("$");
        } else {
            System.out.println("let's not do this for the whole alphabet");
        }


}}
