/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Articoli;

/**
 *
 * @author vladimir.frigento
 */
public class Mobile implements Articolo {

    protected String nome;
    protected double prezzo;
    protected int larghezza, altezza, profondita;

    public Mobile(String nome, double prezzo, int larghezza, int altezza, int profondita) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.larghezza = larghezza;
        this.altezza = altezza;
        this.profondita = profondita;
    }

    public int getLarghezza() {
        return larghezza;
    }

    public int getAltezza() {
        return altezza;
    }

    public int getProfondita() {
        return profondita;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPrezzo() {
        return prezzo;
    }

}
