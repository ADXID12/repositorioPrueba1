package proyectopruegagit1;

public class Motor {

    private String marca, tipo;
    private int potencia, durabilida;

    public Motor(String marca, String tipo, int potencia, int durabilida) {
        this.marca = marca;
        this.tipo = tipo;
        this.potencia = potencia;
        this.durabilida = durabilida;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getDurabilida() {
        return durabilida;
    }

    public void setDurabilida(int durabilida) {
        this.durabilida = durabilida;
    }

}
