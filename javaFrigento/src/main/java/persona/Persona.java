package persona;

import java.lang.*;

/**
 *
 * @author vladimir.frigento
 */
public class Persona {

    private String nome;
    private String residenza;

    public Persona(String n, String r) {
        this.nome = n;
        this.residenza = r;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResidenza() {
        return residenza;
    }

    public void setResidenza(String residenza) {
        this.residenza = residenza;
    }

}
