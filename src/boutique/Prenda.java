
package boutique;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Juan Tavera
 */
public class Prenda implements Serializable{
        private String codigo;
        private String descripcion;
        private double coste;
        private String color;
        private String talla;       
        private double venta;        
        private int stock;

    public Prenda() {     
     codigo = "";
     descripcion = "";
     talla = "";
     color= "";       
    }

    public Prenda(String codigo, String descripcion, double coste, String color, String talla, double venta, int stock) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.coste = coste;
        this.color = color;
        this.talla = talla;
        this.venta = venta;
        this.stock = stock;
    }
    
        
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
 
    public double getVenta() {
        return venta;
    }

    public void setVenta(double venta) {
        this.venta = venta;
    }
       
    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCoste() {
        return coste;
    }

    public void setCoste(double coste) {
        this.coste = coste;
    }        

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.codigo);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Prenda other = (Prenda) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        return true;
    }
   
}
