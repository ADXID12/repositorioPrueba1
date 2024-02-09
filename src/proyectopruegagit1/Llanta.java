package proyectopruegagit1;

public class Llanta {

    private String marca, tiempoResistencia;
    private int precio, grosor;

    public Llanta(String marca, String tiempoResistencia, int precio, int grosor) {
        this.marca = marca;
        this.tiempoResistencia = tiempoResistencia;
        this.precio = precio;
        this.grosor = grosor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTiempoResistencia() {
        return tiempoResistencia;
    }

    public void setTiempoResistencia(String tiempoResistencia) {
        this.tiempoResistencia = tiempoResistencia;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getGrosor() {
        return grosor;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }

}
