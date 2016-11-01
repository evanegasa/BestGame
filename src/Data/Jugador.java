package Data;

import java.awt.Color;

public class Jugador {

    private Color color;
    private int posicion;

    public Jugador(Color color) {
        this.color = color;
        posicion = 0;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }
}