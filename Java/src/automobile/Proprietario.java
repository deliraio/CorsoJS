package automobile;

/**
 *
 * @author vladimir.frigento
 */
public class Proprietario {

    private String nome = "";
    private String cognome = "";

    public Proprietario(String n, String c) {
        this.nome = n;
        this.cognome = c;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    @Override
    public String toString() {
        return "(Nome: " + nome + ", Cognome: " + cognome + ")";
    }

}
