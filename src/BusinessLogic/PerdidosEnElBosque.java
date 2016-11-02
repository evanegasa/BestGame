package BusinessLogic;

import Data.*;
import java.awt.Color;
import ui.UI;

public class PerdidosEnElBosque {

    public static Tablero tablero;
    public static Player p1, p2, p3, p4;
    public static int n1 = 36, n2 = 63, n3 = 92;
    private static Player[] player;
    private static int dado;

    public static void main(String[] args) {
        tablero = new Tablero();
        p1 = new Player(Color.blue);
        p2 = new Player(Color.yellow);
        p3 = new Player(Color.red);
        p4 = new Player(Color.green);

        player = new Player[4];
        player[0] = p1;
        player[1] = p2;
        player[2] = p3;
        player[3] = p4;

        while(true){
            UI.menu();
        }
    }

    public static void jugar() {
        for (Player p : player) {
            p.setPosicion(0);
        }
        UI.imprimirTablero(tablero.getTablero());
        while (true) {
            for (int i = 0; i < player.length; i++) {
                if (player[i].canPlay()) {
                    int playing = 1;
                    while (playing != 0) {
                        UI.whoIsPlaying(i);
                        int movement = UI.rollDice();
                        player[i].setPosicion(player[i].getPosicion() + movement);
                        
                        if(player[i].getPosicion() == 99){
                            UI.imprimirGanador(i);
                            return;
                        }
                        if(player[i].getPosicion() > 99){
                            player[i].setPosicion(player[i].getPosicion() - movement);
                            playing--;
                            break;
                        }
                        
                        Casilla casilla = tablero.getTablero()[player[i].getPosicion()];
                        
                        if(player[i].getPosicion() == n1){
                            UI.print("Elfo enigma: lanza el dado, si obtienes 6 o más, pierdes turno, si sacas menos puedes seguir con tu camino");
                            casilla = tablero.elfoEnigma();
                            if(casilla == null){
                                UI.print("Te has salvado");
                            }
                        }else if (player[i].getPosicion() == n2){
                            UI.print("Mago de la Montaña: lanza el dado, si sacas 8 o más avanzas 10 casillas, pero si sacas menos retrocederás 14 casillas");
                            casilla = tablero.magoMontana();
                        }else if (player[i].getPosicion() == n3){
                            UI.print("El Dragón: Podrás pasar tranquilo si obtienes un número par, de lo contrario perderás 3 turrnos");
                            casilla = tablero.Dragon();
                            if(casilla == null){
                                UI.print("Te has salvado");
                            }
                        }
                        
                        if (casilla != null) {
                            UI.printSquare(player[i].getPosicion());
                            player[i].setPosicion(player[i].getPosicion() + casilla.getPositionControl());
                            if (casilla.getTurnControl() >= 0) {
                                playing += casilla.getTurnControl();
                            } else {
                                player[i].cantPlay(casilla.getTurnControl() * (-1));
                            }
                        }
                        UI.imprimirTablero(tablero.getTablero());
                        playing--;
                    }
                }
            }
        }
    }
}
