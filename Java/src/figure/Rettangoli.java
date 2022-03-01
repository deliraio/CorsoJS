package figure;

/**
 *
 * @author vladimir.frigento
 */
public class Rettangoli extends FiguraGeometrica {

    protected double base;
    protected double altezza;

    public Rettangoli(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public Rettangoli(double base, double altezza, String descrizione) {
        super(descrizione);
        this.base = base;
        this.altezza = altezza;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double getBase() {
        return base;
    }

    public double getAltezza() {
        return altezza;
    }

    public double Perimetro() {
        return 2 * (base + altezza);
    }

    public double Area() {
        return base * altezza;
    }

    @Override
    public String toString() {
        return "Rettangoli{" + "base=" + base + ", altezza=" + altezza + ", descrizione=" + descrizione + '}';
    }

}
