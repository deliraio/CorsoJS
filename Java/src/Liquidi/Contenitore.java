package Liquidi;

/**
 *
 * @author vladimir.frigento
 */
public class Contenitore implements CMP {

    protected int codiceUnivoco;
    protected String tipo;
    protected String liquido;
    protected double qta;

    public Contenitore(String tipo, String liquido, double qta) {
        this.tipo = tipo;
        this.liquido = liquido;
        this.qta = qta;
        this.codiceUnivoco++;
    }

    public int getCodiceUnivoco() {
        return codiceUnivoco;
    }

    public String getTipo() {
        return tipo;
    }

    public String getLiquido() {
        return liquido;
    }

    public double getQta() {
        return qta;
    }

    @Override
    public String toString() {
        return "Contenitore{" + "codiceUnivoco=" + codiceUnivoco + ", tipo=" + tipo + ", liquido=" + liquido + ", qta=" + qta + '}';
    }

    @Override
    public void confronta(Contenitore a, Contenitore b) {
        if(a.tipo==b.tipo){
            if(a.qta>b.qta){
                System.out.println("Il primo contenitore pesa più del secondo");
            }else{
                System.out.println("Il Secondo contenitore pesa più del primo");
            }
        }
        if(a.tipo!=b.tipo){
            System.out.println("I contenitori non sono dello stesso tipo");
        }
        
    }

}
