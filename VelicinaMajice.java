import com.sun.source.util.SourcePositions;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class VelicinaMajice {
    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);
        System.out.print("Unesite velicinu majice: ");

        switch (skener.nextInt()) {
            case 24:
                System.out.println("S velicina");
                break;
            case 30:
                System.out.println("M Velicina");
                break;
            case 36:
                System.out.println("L velicina");
                break;
            case 42:
                System.out.println("XL velicina");
                break;
            default:
                System.out.println("Nepostojeca velicina");
        }


    }


}




