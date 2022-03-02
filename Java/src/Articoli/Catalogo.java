package Articoli;

import java.util.ArrayList;

/**
 *
 * @author vladimir.frigento
 */
public class Catalogo<E extends Articolo> {

    ArrayList<E> catalogo = new ArrayList<>();

    public void aggiungiArticolo(E art) {
        this.catalogo.add(art);
    }

    public ArrayList<E> getArticoliSottoPrezzo(double prezzo) {
        ArrayList<E> articoliSottoprezzo = new ArrayList<>();
        for (int i = 0; i < catalogo.size(); i++) {
            if (catalogo.get(i).getPrezzo() < prezzo) {
                articoliSottoprezzo.add(catalogo.get(i));
            }
        }
        return articoliSottoprezzo;
    }
    
    @Override
    public String toString() {
        return "Catalogo{" + "catalogo=" + catalogo + '}';
    }

}
