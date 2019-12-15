public class Curs4 {
    public static void main (String []args) {


        int zi =9;
        if (zi == 5||zi ==6){


            String s ="abc";
        s +="d";
        s +="e";
        s +="f";
        s +="g";
        s +="h";

        System.out.println("Stringul meu este: "+ s);
        StringBuilder sb =new StringBuilder("abc");
        sb.append('d').append('e').append('f').append('g');
        System.out.println("StringBuilder-ul afisat este " + sb.toString());

        }

        String a ="abc";
        String b ="efga";


        char prima =a.charAt(0);
        System.out.println(prima);
        int ultima =b.length();
        System.out.println(b.length());
        char ultima2 = b.charAt(b.length()-1);
        System.out.println(ultima2);
        if (prima==ultima2){
            System.out.println("Hai la masa!");
        }




    }


    }

