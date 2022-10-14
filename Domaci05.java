//Napraviti  program gde cete da unosite imena u neki niz.
//U istom tom programu dodati ispis za sva imena koja pocinju na 'M'.

import java.util.Arrays;
import java.util.Scanner;

public class Domaci05 {

    public static void main(String[] args) {

        Scanner skener = new Scanner(System.in);
        System.out.println("Unesite duzinu niza: ");
        int duzina = skener.nextInt();
        String[] imena = new String[duzina];
        String[] imenaM = new String[imena.length];
        int brojacZaM = 0;

        for( int i = 0; i < imena.length; i++){
            System.out.println("Unesite ime: ");
            imena[i] = skener.next();
        }

        for (int i = 0; i< imena.length; i++ ) {
            if ( imena[i].toUpperCase().charAt(0) == 'M') {
                System.out.println( "Ime sa pocetnim slovom M je: " + imena[i]);
            }
        }
    }

}

