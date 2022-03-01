package figure;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vladimir.frigento
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<FiguraGeometrica> f = new ArrayList<>();
        f.add(new Triangoli(4, 5, 6));
        f.add(new Rettangoli(5, 10, "rettangolo"));
        f.add(new Quadrati(5, "quadrato"));
        f.add(new Ellisse(10, 20, "ellisse"));
        f.add(new Cerchio(10, "cerchio"));
        double SommaA = 0.0;
        for (int i = 0; i < f.size(); i++) {
            System.out.println("L'area di " + f.get(i).getDescrizione() + " è " + f.get(i).Area());
            SommaA += f.get(i).Area();
        }
        System.out.println("La somma delle area delle figure è: " + SommaA);

    }
}
