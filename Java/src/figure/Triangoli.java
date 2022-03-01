package figure;

import java.lang.Math.*;

/**
 *
 * @author vladimir.frigento
 */
public class Triangoli extends FiguraGeometrica {

    protected double l1, l2, l3;

    public Triangoli(double l1, double l2, double l3) {
        super("Triangoli");
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double getL3() {
        return l3;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }

    public double Perimetro() {
        return l1 + l2 + l3;
    }

    public double Area() {
        double p = Perimetro();
        return Math.sqrt(p / 2 * (p / 2 - l1) * (p / 2 - l2) * (p / 2 - l3));
    }

    @Override
    public String toString() {
        return "Triangoli{" + "l1=" + l1 + ", l2=" + l2 + ", l3=" + l3 + '}';
    }

}
