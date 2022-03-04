
package Universita;

/**
 *
 * @author vladimir.frigento
 */
public class Docente {
    private String nome,cognome;
    private int codice,eta;

    public Docente(String nome, String cognome, int id, int eta) {
        this.nome = nome;
        this.cognome = cognome;
        this.codice = id;
        this.eta = eta;
    }

    public String getCognome() {
        return cognome;
    }

    public int getCodice() {
        return codice;
    }

    public int getEta() {
        return eta;
    }
    
    
}
