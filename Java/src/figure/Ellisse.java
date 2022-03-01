package figure;

/**
 *
 * @author vladimir.frigento
 */
public class Ellisse extends FiguraGeometrica {

    protected double semiMagg, semiMin;

    public Ellisse(double semiMagg, double semiMin) {
        if (semiMagg > semiMin) {
            this.semiMagg = semiMagg;
            this.semiMin = semiMin;
        } else {
            this.semiMagg = semiMin;
            this.semiMin = semiMagg;
        }
    }

    public Ellisse(double semiMagg, double semiMin, String descrizione) {
        super(descrizione);
        if (semiMagg > semiMin) {
            this.semiMagg = semiMagg;
            this.semiMin = semiMin;
        } else {
            this.semiMagg = semiMin;
            this.semiMin = semiMagg;
        }
    }

    public double getSemiMagg() {
        return semiMagg;
    }

    public void setSemiMagg(double semiMagg) {
        this.semiMagg = semiMagg;
    }

    public double getSemiMin() {
        return semiMin;
    }

    public void setSemiMin(double semiMin) {
        this.semiMin = semiMin;
    }

    public double Area() {
        return semiMagg * semiMin * Math.PI;
    }

    /* public double Perimetro() {
        return (2 * Math.PI) * (Math.sqrt((Math.pow(semiMagg, 2) + Math.pow(semiMin, 2)) / 2));
    }*/
    @Override
    public String toString() {
        return "Ellisse{" + "semiMagg=" + semiMagg + ", semiMin=" + semiMin + '}';
    }

}
