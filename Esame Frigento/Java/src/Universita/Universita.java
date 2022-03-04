/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universita;

import java.util.ArrayList;

/**
 *
 * @author vladimir.frigento
 */
public class Universita {

    private Docente[] docenti;

    public Universita(Docente[] docenti) {
        this.docenti = docenti;
    }

    public int etaMinima() {
        int etaMin = 100;
        for (int i = 0; i < docenti.length; i++) {

            if (docenti[i].getEta() < etaMin) {
                etaMin = docenti[i].getEta();
            }

        }
        return etaMin;
    }

    public void trovaGiovani() {
        int etaMinima=etaMinima();
        System.out.println("I docenti con eta: "+etaMinima+" sono:");
        for (int i = 0; i < docenti.length; i++) {
            if(docenti[i].getEta()==etaMinima){
                System.out.println(docenti[i].getCognome());
            }
        }
    }
}
