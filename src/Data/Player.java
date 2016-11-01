package Data;

import java.awt.Color;

public class Player {

    private Color color;
    private int posicion;
    private boolean canPlay = true;
    private int turns;

    public Player(Color color) {
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
    
    public void cantPlay(int turns){
        this.canPlay = false;
        this.turns = turns;
    }

    public boolean canPlay() {
        if(canPlay == false){
            turns--;
        }if(turns == -1){
            canPlay = true;
        }
        
        return canPlay;
    }
}