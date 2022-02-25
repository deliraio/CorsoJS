package persona;

import java.lang.*;

/**
 *
 * @author vladimir.frigento
 */
class ClienteDiPersona {

    public static void main(String[] args) {
        Persona p1 = new Persona("Giovanni", "Roma");
        System.out.println("La residenza di " + p1.getNome() + " e' " + p1.getResidenza());
    }

}
