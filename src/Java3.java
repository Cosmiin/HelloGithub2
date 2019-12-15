import com.sun.corba.se.spi.orbutil.fsm.FSMTest;

import java.util.Scanner;

public class Java3{
    public static void main (String[] args){

   int a = 2;
   float b = 2.575F;
   double d = 2.5D;
  // double d=a+b;
  // float f =a +d;
   //int i = b+f;

System.out.println(a+d);
   System.out.println("a:" +a );
   System.out.println("b:" +b );
   System.out.println("d:" +d );
 //  System.out.println("f:" +f );
   //System.out.println("i:" +i );

        String s ="HelloCosmin";
        String toCompareWith = "HelloCosminacho";


        s.length();
        System.out.println("charAt: "  + s.charAt(10));//iti spune ce caracter din string e numarul din charAt(#)
        System.out.println("boolean endsWith: "+ s.endsWith("ion")); // iti spune daca "n" este ultimul caracter din string-ul s " Hello Cosmin"
        System.out.println("indexOf " +s.indexOf("Co")); //iti spune de pe ce pozitie incepe  "Co" in string-ul s.

        String sproblem ="abcd abhs abcd afsabc";
        System.out.println(sproblem.length());
       // System.out.println(sproblem.charAt("abc"));

        String slowercase = "ASDdasdsAS";
        slowercase=slowercase.toLowerCase();
        System.out.print(slowercase);
        System.out.println(sproblem.split("abc",4));

    }
    }
