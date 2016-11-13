package Data;

import java.awt.Color;

public class Player {

    private Color color;
    private int posicion;
    private String id;
    private boolean canPlay = true;
    private int turns;
    private boolean isWinner;

    public Player(Color color) {
        this.color = color;
        this.id = id;
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