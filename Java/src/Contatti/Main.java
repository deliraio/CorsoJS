/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contatti;

import java.util.Scanner;

/**
 *
 * @author vladimir.frigento
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Rubrica rub = new Rubrica();
        int val;
        do {
            System.out.println("1. Inserisci contatto");
            System.out.println("2. Rimuovi contatto");
            System.out.println("3. Cerca contatto");
            System.out.println("4. Stampa rubrica");
            System.out.println("0. exit");
            System.out.print("Cosa vuoi fare? :");
            val = scan.nextInt();
            switch (val) {
                case 1:
                    System.out.println("- Inserimento contatto -");
                    System.out.print("Inserisci il nome del contatto: ");
                    String n = scan.next();
                    System.out.print("Inserisci il cognome del contatto: ");
                    String c = scan.next();
                    System.out.print("Inserisci il numero di telefono del contatto: ");
                    String num = scan.next();
                    rub.aggiungiContatto(n, c, num);
                    System.out.println("Inserito il contatto: '" + n + " " + c + " = " + num + "'");
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("- Rimozione contatto -");
                    System.out.print("Inserisci il nome del contatto: ");
                    String n1 = scan.next();
                    System.out.print("Inserisci il cognome del contatto: ");
                    String c1 = scan.next();
                    rub.rimuoviContatto(n1, c1);
                    System.out.println("Se presente in rubrica, il contatto '" + n1 + " " + c1 + "' verrà rimosso.");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("- Ricerca contatto -");
                    System.out.print("Inserisci il nome del contatto: ");
                    String n2 = scan.next();
                    System.out.print("Inserisci il cognome del contatto: ");
                    String c2 = scan.next();
                    String num2 = rub.cerca(n2, c2);
                    System.out.println("Il numero di telefono di '" + n2 + " " + c2 + "' è : " + num2);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("- Stampa rubrica -");
                    System.out.println(rub.toString());
                    System.out.println("");
                    break;
                case 0:
                    System.out.println("Fine programma...");
                    System.out.println("");
            }

        } while (val != 0);

    }
}
