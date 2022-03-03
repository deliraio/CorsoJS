/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ristorante;

/**
 *
 * @author vladimir.frigento
 */
public class Prodotto {

    private String nome;
    private double prezzo;

    public Prodotto(String nome, double prezzo) {
        this.nome = nome;
        this.prezzo = prezzo;
    }
    
    public String getNome() {
        return nome;
    }

    public double getPrezzo() {
        return prezzo;
    }

    @Override
    public String toString() {
        return "Ordine{" + "nome=" + nome + ", prezzo=" + prezzo + '}';
    }
    
    
    
}
