import java.util.Scanner;
import java.util.Arrays;
/*1. Napisati program sa metodama za:
1.1 Metoda za unos imena(String element) i ispis niz-a svih elemenata nakon sto se unesu
Unos: Marko
Unos: Jelena
Unos: Dejan
Ispis: Marko, Jelena, Dejan
1.2 Metoda koja pronalazi uniju elemenata neka dva niza i ispisuje tu uniju kao treci niz
Unos: Marko, Jelena, Nikola
Unos: Milan, Jelena, Nikola
Ispis: Marko, Jelena, Nikola, Milan
*/
public class Zadatak {
    public static void main(String[] args) {

        Scanner skener = new Scanner(System.in);
        System.out.println("Koliko imena zelite da unesete?");
        int brojImena = skener.nextInt();
        UnosImenaIIspis(skener, brojImena);
    }

    public static void UnosImenaIIspis ( Scanner skener, int brojImena){
        String [] imena = new String[brojImena];

        for (int i = 0; i < brojImena; i++){
            System.out.println("Unesite ime: ");
            imena[i] = skener.next();
        }

        System.out.println("Uneta imena su: " + Arrays.toString(imena));

    }




}
