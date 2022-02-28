/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scuola;

/**
 *
 * @author vladimir.frigento
 */
public class Classe {
    private ScuolaElementare s;
    private String nome;
    private Insegnante[] i;
    private int numAlunni;

    public Classe(ScuolaElementare s, String nome, Insegnante[] i, int numAlunni) {
        this.s = s;
        this.nome = nome;
        this.i = i;
        this.numAlunni = numAlunni;
    }

    public ScuolaElementare getS() {
        return s;
    }

    public void setS(ScuolaElementare s) {
        this.s = s;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Insegnante[] getI() {
        return i;
    }

    public void setI(Insegnante[] i) {
        this.i = i;
    }

    public int getNumAlunni() {
        return numAlunni;
    }

    public void setNumAlunni(int numAlunni) {
        this.numAlunni = numAlunni;
    }

    @Override
    public String toString() {
        return "Classe{" + "s=" + s + ", nome=" + nome + ", i=" + i + ", numAlunni=" + numAlunni + '}';
    }
    
    
}
