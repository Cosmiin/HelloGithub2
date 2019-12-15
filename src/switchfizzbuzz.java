import java.util.Scanner;

public class switchfizzbuzz {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();
        int a = input%3;
        int b = input%5;


        switch (a|b) { //poti folosi | ca si SAU.
            case 0: // case-urile trebuie sa fie doar numere.
                System.out.println("Fizz Buzz");
               // break;
            default:
                switch (a) {
                    case 0:
                        System.out.println("Fizz");
                       // break;
                    default:
                        switch (b){
                            case 0:
                                System.out.println(" Buzz");
                                //break;
                            default:
                                System.out.println("Alta valoare");
                        }
                }


                }


        }

    }


