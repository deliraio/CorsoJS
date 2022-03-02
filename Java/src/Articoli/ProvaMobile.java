/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Articoli;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author vladimir.frigento
 */
public class ProvaMobile {

    public <M extends Mobile> ArrayList<M> scegliMobile(Catalogo<M> catalogo, double prezzo, int lar, int alt, int prof) {
        ArrayList<M> selezionati = new ArrayList<>();
        ArrayList<M> selezionatiPrezzo = catalogo.getArticoliSottoPrezzo(prezzo);
        Iterator<M> it = selezionatiPrezzo.iterator();
        while (it.hasNext()) {
            M appoggio = it.next();

            if (appoggio.getLarghezza() < lar && appoggio.getAltezza() < alt && appoggio.getProfondita() < prof) {
                selezionati.add(appoggio);
            }
        }
        return selezionati;
    }
}
