package ui;

import BusinessLogic.ControlTurno;
import BusinessLogic.PerdidosEnElBosque;
import static BusinessLogic.PerdidosEnElBosque.*;
import Data.Casilla;
import java.util.Scanner;

public class UI {

    private static Scanner sc = new Scanner(System.in);

    public static void menu() throws InterruptedException {
        System.out.println("BIENVENIDOS A PERDIDOS EN EL BOSQUE");
        System.out.println("1 Jugar");
        System.out.println("2 Ayuda");
        System.out.println("3 Salir");
        
        int i = 0;
        while (i < 1 || i > 3) {
            if(sc.hasNextInt()){
                switch (sc.nextInt()) {
                    case 1: jugar();        break;
                    case 2: ayuda();        break;
                    case 3: System.exit(0); break;
                    default: System.err.println("Invalid input, try again...");
                }
            } else {
                sc.next();
                System.err.println("Invalid input, try again...");
            }
        }
    }

    private static void ayuda() {
        System.out.println("Play and have fun");
    }
    
    public static int rollDice() throws InterruptedException {
        System.out.println("Se están tirando los dados...");
        Thread.sleep(1000);
        int d1=ControlTurno.rollDice();
        int d2=ControlTurno.rollDice();
        System.out.println(d1 + ", " + d2);
        return d1 + d2;
    }

    public static void printCasilla(int posicion) {
        Casilla casilla = PerdidosEnElBosque.tablero.getTablero()[posicion];
        if(casilla==null){
            
        } else if(casilla.isCriatura()){
            System.out.println("Has caido donde: " + casilla.getNombreCasilla());
            System.out.println(casilla);
        }
    }

}
