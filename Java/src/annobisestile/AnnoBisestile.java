package annobisestile;

import java.util.Scanner;

/**
 *
 * @author vladimir.frigento
 */
public class AnnoBisestile {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Controllo anno bisestile");
        System.out.println("Inserisci il carattere - per interrompere il programma...");
        System.out.print("Inserisci l'anno da controllare: ");
        int anno = scan.nextInt();
        if (((anno % 4 == 0) && (anno % 100 != 0)) || (anno % 400 == 0)) {
            System.out.println("L'anno inserito è bisestile");
        } else {
            System.out.println("L'anno inserito NON è bisestile");
        }
    }

}
