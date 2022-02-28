/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scuola;

/**
 *
 * @author vladimir.frigento
 */
public class Insegnante extends Persona {

    private int annoVincita;
    private ScuolaElementare s;

    public Insegnante(int annoVincita, ScuolaElementare s, String nome, String cognome) {
        super(nome, cognome);
        this.annoVincita = annoVincita;
        this.s = s;
    }

    public int getAnnoVincita() {
        return annoVincita;
    }

    public void setAnnoVincita(int annoVincita) {
        this.annoVincita = annoVincita;
    }

    public ScuolaElementare getS() {
        return s;
    }

    public void setS(ScuolaElementare s) {
        this.s = s;
    }

    @Override
    public String toString() {
        return "Insegnante{" + "annoVincita=" + annoVincita + ", s=" + s + '}';
    }

}
