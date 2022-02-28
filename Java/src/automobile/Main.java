/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package automobile;

import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author vladimir.frigento
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i;
        ArrayList<Proprietario> listap = new ArrayList<>();
        ArrayList<Automobile> listaa = new ArrayList<>();
        do {
            System.out.println("---------------");
            System.out.println("1. inserimento proprietario");
            System.out.println("2. inserimento macchina");
            System.out.println("3. cambio proprietario");
            System.out.println("4. cambio colore");
            System.out.println("5. stampa automobili");
            System.out.println("6. stampa proprietari");
            System.out.println("0. esci");
            System.out.print("Cosa vuoi fare? : ");
            i = scan.nextInt();
            System.out.println("");
            System.out.println("-------------");
            System.out.println("");
            switch (i) {
                case 1:
                    System.out.print("Inserisci il nome del proprietario: ");
                    String nome = scan.next();
                    System.out.print("Inserisci il cognome del proprietario: ");
                    String cognome = scan.next();
                    listap.add(new Proprietario(nome, cognome));
                    break;
                case 2:
                    System.out.print("Inserisci la targa della macchina: ");
                    String targa = scan.next();
                    System.out.print("Inserisci il modello della macchina: ");
                    String modello = scan.next();
                    System.out.print("Inserisci il colore della macchina: ");
                    String colore = scan.next();
                    /*System.out.println("Chi è il proprietario? ");
                    for (int j = 0; j < listap.size(); j++) {
                        System.out.println(j + ". " + listap.get(j).getNome() + " " + listap.get(j).getCognome());
                    }
                    System.out.print("Inserisci n proprietario: ");
                    int val = scan.nextInt();*/
                    listaa.add(new Automobile(targa, modello, colore));
                    break;
                case 3:
                    System.out.println("Seleziona la macchina a cui cambiare proprietario: ");
                    for (int j = 0; j < listaa.size(); j++) {
                        System.out.println(j + ". " + listaa.get(j).getModello() + " targata: " + listaa.get(j).getTarga());
                    }
                    System.out.print("Inserisci n macchina: ");
                    int val2 = scan.nextInt();
                    System.out.println("Seleziona il nuovo proprietario: ");
                    for (int k = 0; k < listap.size(); k++) {
                        System.out.println(k + ". " + listap.get(k).getNome() + " " + listap.get(k).getCognome());
                    }
                    System.out.print("Inserici n proprietario: ");
                    int val3 = scan.nextInt();
                    listaa.get(val2).setP(listap.get(val3));
                    System.out.println("Il nuovo proprietario della macchina " + listaa.get(val2).getTarga() + " è " + listaa.get(val2).getP().getNome() + " " + listaa.get(val2).getP().getCognome());

                    break;
                case 4:
                    System.out.println("Seleziona la macchina alla quale cambiare colore: ");
                    for (int j = 0; j < listaa.size(); j++) {
                        System.out.println(j + ". " + listaa.get(j).getModello() + " targata: " + listaa.get(j).getTarga());
                    }
                    System.out.print("Inserisci n macchina:");
                    int val4 = scan.nextInt();
                    System.out.print("Di che colore vuoi cambiare la macchina? : ");
                    String newColor = scan.next();
                    listaa.get(val4).setColore(newColor);
                    System.out.println("Il nuovo colore della macchina " + listaa.get(val4).getTarga() + " è " + listaa.get(val4).getColore());
                    break;
                case 5:
                    System.out.println("Lista delle macchine: ");
                    for (int j = 0; j < listaa.size(); j++) {
                        System.out.println(j + ". " + listaa.get(j).toString());
                    }
                    break;
                case 6:
                    System.out.println("Lista dei proprietari: ");
                    for (int j = 0; j < listap.size(); j++) {
                        System.out.println(j+". "+listap.get(j).toString());
                        
                    }

            }

        } while (i != 0);
        /*  System.out.println("---------------");
        System.out.println("Inserimento proprietario");
        System.out.println("---------------");
        System.out.print("Inserisci il nome del proprietario: ");
        String nome = scan.nextLine();
        System.out.print("Inserisci il cognome del proprietario: ");
        String cognome = scan.nextLine();
        //    Proprietario p = new Proprietario(nome, cognome);
        System.out.println("---------------");
        System.out.println("Inserimento macchina");
        System.out.println("---------------");
        System.out.print("Inserisci la targa della macchina: ");
        String targa = scan.nextLine();
        System.out.print("Inserisci il modello della macchina: ");
        String modello = scan.nextLine();
        System.out.print("Inserisci il colore della macchina: ");
        String colore = scan.nextLine();
        Automobile m = new Automobile(targa, modello, colore, p);
        System.out.println("---------------");
        System.out.println("Risultato");
        System.out.println("---------------");
        System.out.println("L'automobile: " + m.getModello() + "\nTargata: " + m.getTarga() + "\nDi colore: "
                + m.getColore() + "\nÉ intestata a: " + m.getP().getNome() + " " + m.getP().getCognome());*/
    }
}
