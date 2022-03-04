/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universita;

/**
 *
 * @author vladimir.frigento
 */
public class DocenteAssociato extends Docente {

    private int votoDiDottorato;
    private Contratti[] c;

    public DocenteAssociato(int votoDiDottorato, Contratti[] c, String nome, String cognome, int id, int eta) {
        super(nome, cognome, id, eta);
        this.votoDiDottorato = votoDiDottorato;
        this.c = c;
    }

    public int getVotoDiDottorato() {
        return votoDiDottorato;
    }

    public int getAnniContratti() {
        int anni = 0;
        for (int i = 0; i < c.length; i++) {
            anni += c[i].getDurataContrattoLavoro();
        }
        return anni;
    }

}
