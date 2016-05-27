
package boutique;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Tavera
 */
public class ListaPrendas implements Serializable {

    private ArrayList<Prenda> lista;

    public ListaPrendas() {
        lista = new ArrayList<>();
    }

    public ArrayList<Prenda> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Prenda> lista) {
        this.lista = lista;
    }

    public boolean existe(Prenda p) {
        return lista.contains(p);
    }

    public void altaPrenda(Prenda p) {
        lista.add(p);
    }

    public void bajaPrenda(Prenda p) {
        lista.remove(p);
    }

    public ArrayList<String> colores() {
        ArrayList<String> esp = new ArrayList<>();
        for (Prenda p : lista) {
            if (!esp.contains(p.getColor())) {
                esp.add(p.getColor());
            }
        }
        return esp;
    }

    public ListaPrendas prendasPorColor(String color) {
        ListaPrendas prendasCol = new ListaPrendas();
        for (Prenda p : lista) {
            if (color.equalsIgnoreCase(p.getColor())) {
                prendasCol.altaPrenda(p);
            }
        }
        return prendasCol;
    }

    public String valorStock() {

        DecimalFormat dv = new DecimalFormat("##.##");
        double valor = 0;
        for (Prenda p : lista) {
            double valorprendas = p.getCoste() * p.getStock();
            valor += valorprendas;
        }
        return dv.format(valor);
    }

    public int totalPrendas() {
        int numeroprendas = 0;
        for (Prenda p : lista) {
            numeroprendas += +p.getStock();
        }
        return numeroprendas;
    }
}
