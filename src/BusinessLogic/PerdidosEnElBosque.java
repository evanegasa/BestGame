package BusinessLogic;

import Data.*;
import java.awt.Color;
import ui.GUI;
import ui.UI;

public class PerdidosEnElBosque {

    public static Tablero tablero;
    public static int n1 = 36, n2 = 63, n3 = 92;
    private static Player[] player;
    private static int dado;
    private static GUI GUI;
    

    public static void main(String[] args) {
        tablero = new Tablero();
        player = new Player[4];
        player[0] = new Player(Color.blue);
        player[1] = new Player(Color.yellow);
        player[2] = new Player(Color.red);
        player[3] = new Player(Color.green);
        
        GUI = new GUI();
        

//        while(true){
//            GUI.menu();
//        }
    }
    
    public static void jugar() {
    
        //System.exit(0);
    }

    public static Player[] getPlayer() {
        return player;
    }

   
}
