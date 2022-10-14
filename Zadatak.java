//Pomnoziti dva broja putem while petlje  tako da se obrati paznja na mnozenje negativnih brojeva.

import java.util.Scanner;

public class Zadatak {
    public static void main(String[] args) {

                Scanner s = new Scanner(System.in);
                System.out.print("unesite prvi broj: ");
                int prviBroj = s.nextInt();
                int x = Math.abs(prviBroj);
                int ciniocx =x;
                System.out.print("unesite drugi broj: ");
                int drugiBroj = s.nextInt();
                int y = Math.abs(drugiBroj);
                int proizvod = 0;

                while (x > 0) {
                    proizvod = proizvod + y;
                    x--;
                }

                System.out.println("Proizvod brojeva " + prviBroj + " i " + drugiBroj + " je " + proizvod);
            }




}
