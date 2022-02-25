package figure;

/**
 *
 * @author vladimir.frigento
 */
public class Rettangolo {

    private int altezza;
    private int larghezza;

    public Rettangolo(int a, int l) {
        this.altezza = a;
        this.larghezza = l;
    }

    public int getPerimetro() {
        return (altezza * 2) + (larghezza * 2);
    }

    public int getArea() {
        return altezza * larghezza;
    }

    public static void main(String[] args) {
        Rettangolo r = new Rettangolo(5, 4);
        System.out.println("Perimetro del rettangolo: " + r.getPerimetro());
        System.out.println("Area del rettangolo: " + r.getArea());
    }
}
