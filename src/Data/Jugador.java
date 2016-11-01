package Data;

import java.awt.Color;

public class Jugador {

    private Color color;
    private int posicion;
    private boolean canPlay = true;

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

    public boolean isCanPlay() {
        return canPlay;
    }

    public void setCanPlay(boolean canPlay) {
        this.canPlay = canPlay;
    }
}