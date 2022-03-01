package Liquidi;

import java.util.ArrayList;

/**
 *
 * @author vladimir.frigento
 */
public class Utils {
    
    public ArrayList<Contenitore> filtra(ArrayList<Contenitore> t,Contenitore b){
        for (int i = 0; i < t.size(); i++) {
            if(t.get(i).getLiquido()!=b.getLiquido()){
                t.remove(i);
            }
        }
        return t;
    }
}
