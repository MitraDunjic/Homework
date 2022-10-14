//Uneti broj ciji faktorijal zelite da izracunate (5! = 5 * 4 * 3 * 2 * 1). Unos: 5 Ispis: 120

import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) {

        Scanner skener = new Scanner(System.in);
        System.out.println("Unesite broj ciji faktorijal zelite da izracunate: ");
        int broj = skener.nextInt();
        System.out.println("Faktorijal unetog broja je: " + faktorijal(5));
    }

    public static int faktorijal (int broj){
        int rezultat = 1;
        for ( int i = 1; i <=broj; i ++){
            rezultat = rezultat * i;
        }
        return rezultat;
    }

}
