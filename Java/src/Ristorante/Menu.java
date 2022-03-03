/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ristorante;

/**
 *
 * @author vladimir.frigento
 */
public class Menu {

    private Prodotto piatto[];
    private Prodotto bevande[];

    public Menu() {
        Prodotto p1 = new Prodotto("pasta", 2);
        Prodotto p2 = new Prodotto("pasta 1", 3);
        Prodotto p3 = new Prodotto("pasta 2", 1);
        Prodotto p4 = new Prodotto("pasta 3", 4);
        Prodotto p[] = {p1, p2, p3, p4};
        this.piatto = p;
        Prodotto b1 = new Prodotto("acqua", 1);
        Prodotto b2 = new Prodotto("vino", 5);
        Prodotto b3 = new Prodotto("cola", 3);
        Prodotto b4 = new Prodotto("birra", 4);
        Prodotto b[] = {b1, b2, b3, b4};
        this.bevande = b;
    }

    public Prodotto getPiatto(int npiatto) {
        return piatto[npiatto];
    }
    
    public Prodotto getBevanda(int nbevanda){
        return bevande[nbevanda];
    }

    public void stampaPiatti() {
        for (int i = 0; i < piatto.length; i++) {
            System.out.println(i + ". ->" + piatto[i].getNome() + ", €" + piatto[i].getPrezzo());
        }
    }

    public void stampaBevande() {
        for (int i = 0; i < bevande.length; i++) {
            System.out.println(i + ". ->" + bevande[i].getNome() + ", €" + bevande[i].getPrezzo());
        }
    }

    @Override
    public String toString() {
        return "Menu{" + "piatto=" + piatto + ", bevande=" + bevande + '}';
    }

}
