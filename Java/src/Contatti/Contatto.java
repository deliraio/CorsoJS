/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Contatti;

/**
 *
 * @author vladimir.frigento
 */
public class Contatto {

    protected String nome, cognome, numTel;

    public Contatto(String nome, String cognome, String numTel) {
        this.nome = nome;
        this.cognome = cognome;
        this.numTel = numTel;
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public String getNumTel() {
        return numTel;
    }

    @Override
    public String toString() {
        return "Contatto{" + "nome=" + nome + ", cognome=" + cognome + ", numTel=" + numTel + "}\n";
    }

}
