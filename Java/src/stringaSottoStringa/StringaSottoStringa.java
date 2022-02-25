package stringaSottoStringa;

import java.util.Scanner;

/**
 *
 * @author vladimir.frigento
 */
public class StringaSottoStringa {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Inserisci la prima stringa: ");
        String s1 = s.nextLine();
        System.out.println("Inserisci la seconda stringa: ");
        String s2 = s.nextLine();
        verifica(s1, s2);

    }

    public static void verifica(String s1, String s2) {
        if (s1.contains(s2)) {
            System.out.println("La stringa " + s1 + " contiene la sottostringa " + s2);
        } else {
            System.out.println("La stringa" + s1 + " NON contiene la sottostringa" + s2);
        }
    }
}
