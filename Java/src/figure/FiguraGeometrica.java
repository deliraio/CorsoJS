package figure;

/**
 *
 * @author vladimir.frigento
 */
public abstract class FiguraGeometrica {

    protected String descrizione;

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public double Area() {
        return 0;
    }

    @Override
    public String toString() {
        return "FiguraGeometrica{" + "descrizione=" + descrizione + '}';
    }

}
