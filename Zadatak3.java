// Napisati pomocu petlje program koji racuna sumu kvadratnih vrednost od 1 2 3 i 5, ako korisnik unese
//0, izlazi iz programa. (Obratiti paznju na negativne brojeve).

import java.util.Scanner;

public class Zadatak3 {
    public static void main(String[] args) {

        int suma = 0;
        Scanner mojSkener = new Scanner(System.in);

        while (true) {
            System.out.print("Unesite neki broj izmedju 1 i 5: ");
            int unetiBroj = mojSkener.nextInt();

            if (unetiBroj == 0) {
                break;
            }
            if (unetiBroj != 4) {
                System.out.print("Unesite neki broj izmedju 1 i 5: ");
                suma = suma + unetiBroj * unetiBroj;
                System.out.println("Zbir kvadrata unetih brojeva je: " + suma);
            }
        }

            System.out.println("Prekid Programa");



    }

}
