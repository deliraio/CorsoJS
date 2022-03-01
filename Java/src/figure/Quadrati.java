package figure;

/**
 *
 * @author vladimir.frigento
 */
public class Quadrati extends Rettangoli {

    protected double lato;

    public Quadrati(double lato, String descrizione) {
        super(lato, lato, descrizione);
    }

    public double getLato() {
        return lato;
    }

    public void setLato(double lato) {
        this.lato = lato;
    }

    @Override
    public String toString() {
        return "Quadrati{" + "lato=" + lato + '}';
    }

}
