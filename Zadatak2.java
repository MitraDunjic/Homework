//Napraviti metod koji ce za dva uneta Stringa proveriti da li su iste velicine, ako su iste velicine,
//ispisati sve samoglasnike iz oba Stringa.

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);
        System.out.println("Unesite prvu rec: ");
        String rec1 = skener.next();
        System.out.println("Unesite drugu rec: ");
        String rec2 = skener.next();
        poredjenjeStringova(rec1, rec2);
    }
    public static void poredjenjeStringova (String rec1, String rec2){
        if ( rec1.length() == rec2.length()){
            System.out.println("Unete dve reci su jednake duzine");
            System.out.print("Uneti samoglasnici su: ");
            for (int i = 0; i < rec1.length(); i++ )
            {
                if (rec1.toUpperCase().charAt(i) == 'A' || rec1.toUpperCase().charAt(i) == 'E' || rec1.toUpperCase().charAt(i) == 'I' || rec1.toUpperCase().charAt(i) == 'O' || rec1.toUpperCase().charAt(i) == 'U'){
                    System.out.print(rec1.charAt(i) + ", ");
                }
            }

            for (int i = 0; i < rec2.length(); i++ )
            {
                if (rec2.toUpperCase().charAt(i) == 'A' || rec2.toUpperCase().charAt(i) == 'E' || rec2.toUpperCase().charAt(i) == 'I' || rec2.toUpperCase().charAt(i) == 'O' || rec2.toUpperCase().charAt(i) == 'U'){
                    System.out.print(rec2.charAt(i) + ", ");
                }
            }
        }
    }





}


