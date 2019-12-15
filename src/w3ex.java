import java.sql.SQLOutput;
import java.util.Scanner;

public class w3ex {
    public static void main (String[]args){
/*
        Scanner input = new Scanner(System.in);//introducem metoda scanner
        System.out.println("Pick a number: ");
        int a = input.nextInt(); //permitem a sa primeasca input de la noi
        System.out.println("Pick another number: ");
        int b = input.nextInt();//permitem b sa primeasca input de la noi
        int DIVISION = (a/b);
        System.out.println("This is their DIVISIN :"+DIVISION);

 */
/*
int a = -5+8*6;
int b=(55+9)%9; // modulus returneaza restul. 64/9= 7 rest 1
int c= 20+-3*5/8; // / --> returneaza cat-ul adica de cate ori intra un numar in celalalt.
int d =5+15/3*2-8%3;
        System.out.println("a :"+ a);
        System.out.println("b :"+b);
        System.out.println("c :"+ c);
        System.out.println("d :"+d);
*/

/*
            Scanner in = new Scanner(System.in);

        System.out.println("Pick a number :");
        int num1 =in.nextInt();
                for (int i=0;i<10;i++){ // in cazul for mereu trebuie declarata tipul variabilei
                    System.out.println (num1 + "x" + (i + 1) + "=" + (num1 * (i + 1)));

                }
*/
/*
double exp = ((25.5*3.5-3.5*3.5)/(40.5-4.5));
        System.out.println(exp);
*/
/*
double radius =7.5;
double perimeter = 2*Math.PI*radius;
double area = Math.PI*radius*radius;

        System.out.println(perimeter + "<-- Perimeter"+ "|  |"+ area + "<--area");
*/

//Scanner input = new Scanner(System.in);
   //     System.out.println("Pick the first number: ");
     //   int a =input.nextInt();
       // System.out.println("Pick the second number: ");
        //int b = input.nextInt();
        //System.out.println("Pick the third number: ");
        //int c = input.nextInt();
        //System.out.println("This is the average of the numbers: "+ (a + b+ c)/3);


     /*   int SumaInitiala = 100;
        Scanner scanner = new Scanner (System.in);
        String raspuns;
        int NumarMaximErori = 5;

        while (true){
            System.out.println("Angajator: Iti voi plati " + SumaInitiala+" Euro, ok?");
            raspuns = scanner.nextLine();
            if ("mai mult".equalsIgnoreCase(raspuns)) {
                System.out.println("Cosmin: Suma de " + SumaInitiala + "nu ma multumeste");
                SumaInitiala += 100;
            }
            else if ("ok".equalsIgnoreCase(raspuns)) {
                System.out.println("Salariul este: " + SumaInitiala);
                break;
            }
                else {
                    if (--NumarMaximErori ==0){
                        System.out.println("Multumesc ca ai venit. Esti peste bugetul nostru");
                        System.exit(0);


                    }
                }
            }*/
/*
     String S = "I am a ninja programmer";
     String SS = S.toLowerCase();
     int contor =0;
     char vocala;
     for (int i = 0; i<SS.length();++i){
         vocala == SS.charAt(i);
         switch (vocala);
         case 'a':
         case: 'e'
         case 'i'
         case 'o':


     }
     */
Scanner input = new Scanner (System.in);
String line;
while (true){
    line =input.next();
    if ("quit".equalsIgnoreCase(line)) {

        continue;}

        System.out.println("Abia astept testul");


    }

}

        }







