public class Homework {
    public static void main (String []args){
        //1. Afisati la consola textul "Am inceput exercitiile. Abia astept sa le rezolv!".
        System.out.println ("Afisati la consola textul: Am inceput exercitiile. Abia astept sa le rezolv");
        System.out.println ("Am inceput exercitiile. Abia astept sa le rezolv!");
        //Afisati la consola diferenta dintre 65 si 14.
        System.out.println ("Afisati la consola diferenta dintre 65 si 14.");
        int a1 = 65;
        int b2= 14;

        System.out.println(a1-b2);
        //3. Afisati la consola catul si restul impartirii lui 65 la 14.
        System.out.println("Afisati la consola catul si restul impartirii lui 65 la 14.");
        System.out.println  ("cat-ul: " + a1/b2);
       System.out.println("restul: " + a1%b2);

       //4. Declarati 3 variabile de tip int, float, double si dati-le valorile 4, 4.0, 4.2. Afisati-le la consola.

        System.out.println("Declarati 3 variabile de tip int, float, double si dati-le valorile 4, 4.0, 4.2. Afisati-le la consola.");

        int x=4;
        float y= 4L;
        double z=4.2;

        System.out.println("x - int:"+x);
        System.out.println("y - float:"+y);
        System.out.println("z - double:"+z);

        //5. Incrementati variabila double prin 3 metode diferite si afisati la consola.
        System.out.println("Incrementati variabila double prin 3 metode diferite si afisati la consola.");

        System.out.println ("incrementare normala :"+ z+1); // mai avem ceva?
        System.out.println ("preincrement :"+ ++z);
        System.out.println ("postincrement :"+ z++);



//Avem variabilele a = -2 si b = --a - a-- + ++a + 1 + a * a - a % 3
// Ce valori au in final a si b? Afisati-le la consola separate prin virgula.

        System.out.println ("Avem variabilele a = -2 si b = --a - a-- + ++a + 1 + a * a - a % 3. Ce valori au in final a si b? Afisati-le la consola separate prin virgula.");
        int a=-2;
        int b =--a - a-- + ++a+ 1 + a * a - a % 3;
        System.out.println (a);
        System.out.println (b);

//Declarati doua variabile de tip float cu valorile 6.45 si 3.19. Afisati rezultatul adunarii, scaderii, inmultirii, impartirii, pe rand, in formatele int, float, double.

        float Numfloat1 =6.45F;
                float Numfloat2 =3.19F;

                System.out.println ("Suma "+ Numfloat1+Numfloat2);
        System.out.println ("Scadere "+ Numfloat1*Numfloat2);
        System.out.println ("Imumltire "+ Numfloat1/Numfloat2);
        //System.out.println ("Impartirii"+ Numfloat1-Numfloat2);

        double o = 89.8;
                int oo = (o-(int)o>=5 ?((int)o+1):(int)o);// "(int)" e o procedura de cast

        System.out.println(oo);

        String s = "abcdabcefg";
        String ss = "dabc";

        //1. cerinta e sa se identifice unde in string-ul s se gaseste dabc
        //2. Trebuie sa se afiseze si ce e dupa dabc.

        int pozitie = s.indexOf(ss);
        System.out.println("Pozitia lui "+ss + " este " + pozitie);
        String aux = s.substring(pozitie);
        int pozitieNoua = ss.length()+pozitie;

        System.out.println(pozitieNoua);




    }
}
