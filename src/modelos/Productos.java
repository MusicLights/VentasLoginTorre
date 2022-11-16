
package modelos;

public class Productos {
    int id;
    String nomproductos;
    int precioproductos;
    int totalproductos;
    int cantidadproductos;
    int total;

    public Productos() {
    }

    public Productos(int id, String nomproductos, int precioproductos, int totalproductos, int cantidadproductos, int total) {
        this.id = id;
        this.nomproductos = nomproductos;
        this.precioproductos = precioproductos;
        this.totalproductos = totalproductos;
        this.cantidadproductos = cantidadproductos;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomproductos() {
        return nomproductos;
    }

    public void setNomproductos(String nomproductos) {
        this.nomproductos = nomproductos;
    }

    public int getPrecioproductos() {
        return precioproductos;
    }

    public void setPrecioproductos(int precioproductos) {
        this.precioproductos = precioproductos;
    }

    public double getTotalproductos() {
        return totalproductos;
    }

    public void setTotalproductos(int totalproductos) {
        this.totalproductos = totalproductos;
    }

    public int getCantidadproductos() {
        return cantidadproductos;
    }

    public void setCantidadproductos(int cantidadproductos) {
        this.cantidadproductos = cantidadproductos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
}
