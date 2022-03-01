package figure;

/**
 *
 * @author vladimir.frigento
 */
public class Cerchio extends Ellisse {

    protected double raggio;

    public Cerchio(double raggio, String descrizione) {
        super(raggio, raggio, descrizione);
    }

    public double getRaggio() {
        return raggio;
    }

    public void setRaggio(double raggio) {
        this.raggio = raggio;
    }

    @Override
    public double Area() {
        return raggio * raggio;
    }

    @Override
    public String toString() {
        return "Cerchio{" + "raggio=" + raggio + '}';
    }

}
