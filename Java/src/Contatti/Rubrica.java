/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contatti;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vladimir.frigento
 */
public class Rubrica {

    Scanner scan = new Scanner(System.in);
    ArrayList<Contatto> rubrica = new ArrayList<>();

    public void aggiungiContatto(String n, String c, String num) {
        rubrica.add(new Contatto(n, c, num));
    }

    public void rimuoviContatto(String n, String c) {
        for (int i = 0; i < rubrica.size(); i++) {
            if (rubrica.get(i).getNome().equalsIgnoreCase(n) && rubrica.get(i).getCognome().equalsIgnoreCase(c)) {
                rubrica.remove(i);
            }
        }
    }

    public String cerca(String n, String c) {
        String app = null;
        for (int i = 0; i < rubrica.size(); i++) {
            if (rubrica.get(i).getNome().equalsIgnoreCase(n) && rubrica.get(i).getCognome().equalsIgnoreCase(c)) {
                app = rubrica.get(i).getNumTel();
            }

        }
        return app;

    }

    @Override
    public String toString() {
        return "Rubrica{" + "rubrica=" + rubrica + "}";
    }

}
