package BusinessLogic;

import Data.*;
import java.awt.Color;
import ui.UI;

public class PerdidosEnElBosque {

    public static Tablero tablero;
    public static Player p1;
    public static Player p2;
    private static Player[] player;
    private static int dado;
    
    public static void main(String[] args) throws InterruptedException {
        tablero = new Tablero();
        p1 = new Player(Color.blue);
        p2 = new Player(Color.yellow);
        
        player = new Player[2];
        player[0] = p1;
        player[1] = p2;
        
        UI.menu();
    }
    
    public static void jugar() throws InterruptedException{
        while(true){
            
            for (int i = 0; i < player.length; i++) {
                if(player[i].canPlay()){
                    player[i].setPosicion(player[i].getPosicion() + UI.rollDice());
                    UI.printCasilla(player[i].getPosicion());
//                    player[i].setPosicion(player[i].getPosicion() + );
//                    player[i].cantPlay(int); --> metodo para cuando pierde turnos, pille la clase player
                }
            }
        }
    }
    
    private static Player getCurrentPlayer(Player player){
        if(player == null) return p1;
        if(player == p1) return p2;
        if(player == p2) return p1;
        return null;
    }

   
}
