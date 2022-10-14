import java.sql.SQLOutput;
import java.util.Scanner;

import static java.util.Scanner.*;

public class GodineRadnogIskustva {
    public static void main(String[] args) {

        Scanner skener = new Scanner(System.in);
        System.out.println("Unesite godinu kada ste poceli da radite: ");
        
        int GodineRadnogIskustva = 2022 - skener.nextInt();

        if (GodineRadnogIskustva <=4) {
            System.out.println("Ti si Junior programer");
        } else if (GodineRadnogIskustva >4 && GodineRadnogIskustva<8 ) {
            System.out.println("Ti si Senior programer");
        }
        else  {
            System.out.println("Vi ste direktor firme");
        }
    }


}
