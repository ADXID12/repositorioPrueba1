package proyectopruegagit1;

import java.awt.Color;

public class Carrito {

    private String marca;
    private int numeroPuertas;
    private Color color;
    private Llanta llanta;
    private Motor motor;

    public Carrito(String marca, int numeroPuertas, Color color, Llanta llanta, Motor motor) {
        this.marca = marca;
        this.numeroPuertas = numeroPuertas;
        this.color = color;
        this.llanta = llanta;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Llanta getLlanta() {
        return llanta;
    }

    public void setLlanta(Llanta llanta) {
        this.llanta = llanta;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Carrito{" + "marca=" + marca + ", numeroPuertas=" + numeroPuertas + ", color=" + color + ", llanta=" + llanta + ", motor=" + motor + '}';
    }

}
