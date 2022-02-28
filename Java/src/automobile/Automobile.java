package automobile;

/**
 *
 * @author vladimir.frigento
 */
public class Automobile {

    private String targa;
    private String modello;
    private String colore;
    private Proprietario persona;

    public Automobile(String t, String m, String c) {
        this.targa = t;
        this.modello = m;
        this.colore = c;

    }

    public String getTarga() {
        return targa;
    }

    public String getModello() {
        return modello;
    }

    public String getColore() {
        return colore;
    }

    public Proprietario getP() {
        return persona;
    }

    public void setColore(String colore) {
        this.colore = colore;
    }

    public void setP(Proprietario p) {
        this.persona = p;
    }

    @Override
    public String toString() {
        return "Automobile " + "Targata: " + targa + ", Modello: " + modello + ", Colore: " + colore + ", Intestata a: " + persona;
    }

}
