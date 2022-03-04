/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Universita;

/**
 *
 * @author vladimir.frigento
 */
public class UniversitàAssociati extends Universita {

    private DocenteAssociato[] docentiAssociati;

    public UniversitàAssociati(DocenteAssociato[] docentiAssociati, Docente[] docenti) {
        super(docenti);
        this.docentiAssociati = docentiAssociati;
    }

    public DocenteAssociato bestRicercatore() {
        DocenteAssociato migliorDocente = null;
        int votoMassimo = 0;
        for (int i = 0; i < docentiAssociati.length; i++) {
            if (docentiAssociati[i].getVotoDiDottorato() > votoMassimo) {
                votoMassimo = docentiAssociati[i].getVotoDiDottorato();
                migliorDocente = docentiAssociati[i];
            } else if (docentiAssociati[i].getVotoDiDottorato() == votoMassimo) {
                if (docentiAssociati[i].getAnniContratti() > migliorDocente.getAnniContratti()) {
                    migliorDocente = docentiAssociati[i];
                } else if (docentiAssociati[i].getAnniContratti() == migliorDocente.getAnniContratti()) {
                    if (docentiAssociati[i].getEta() < migliorDocente.getEta()) {
                        migliorDocente = docentiAssociati[i];
                    }
                }
            }
        }
        return migliorDocente;
    }
}
