/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Scuola;

/**
 *
 * @author vladimir.frigento
 */
public class ScuolaElementare {

    private String nome, indirizzo, provveditorato;

    public ScuolaElementare(String nome, String indirizzo, String provveditorato) {
        this.nome = nome;
        this.indirizzo = indirizzo;
        this.provveditorato = provveditorato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIndirizzo() {
        return indirizzo;
    }

    public void setIndirizzo(String indirizzo) {
        this.indirizzo = indirizzo;
    }

    public String getProvveditorato() {
        return provveditorato;
    }

    public void setProvveditorato(String provveditorato) {
        this.provveditorato = provveditorato;
    }

    @Override
    public String toString() {
        return "ScuolaElementare{" + "nome=" + nome + ", indirizzo=" + indirizzo + ", provveditorato=" + provveditorato + '}';
    }

}
