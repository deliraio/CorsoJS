package maiuscoleAlternate;

import java.util.Scanner;

/**
 *
 * @author vladimir.frigento
 */
public class Maiuscole {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Inserisci una stringa da convertire: ");
        String stringa = s.nextLine();
        stringa = stringa.toLowerCase();
        String nuovaStringa = "";
        for (int i = 0; i < stringa.length(); i++) {

            if (i % 2 == 0) {
                nuovaStringa += Character.toUpperCase(stringa.charAt(i));
            } else {
                nuovaStringa += stringa.charAt(i);
            }

        }
        System.out.println("La nuova stringa risulta essere: " + nuovaStringa);

    }

}
