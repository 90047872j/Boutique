
package boutique;

import java.awt.Color;
import utilidades.Fichero;

/**
 *
 * @author Juan Tavera
 */
public class Boutique {
    
    public static Fichero miFichero;
    public static ListaPrendas misPrendas;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        miFichero = new Fichero("prendas.xml");
        misPrendas = (ListaPrendas) miFichero.leer();
        if (misPrendas == null) {
            misPrendas = new ListaPrendas();
        }
        Menu m = new Menu();
        m.getContentPane().setBackground(new Color(255,255,204));
        m.setLocationRelativeTo(null);
        m.setVisible(true);
    }
    
}
