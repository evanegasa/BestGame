package ui;

import BusinessLogic.*;
import Data.*;
import static BusinessLogic.PerdidosEnElBosque.*;

import java.util.Scanner;

public class UI implements InterfazGrafica{

    private Scanner sc = new Scanner(System.in);

    @Override
    public void menu() {
        System.out.println("BIENVENIDOS A PERDIDOS EN EL BOSQUE");
        System.out.println("1 Jugar");
        System.out.println("2 Ayuda");
        System.out.println("3 Salir");
        
        int i = 0;
        while (i < 1 || i > 3) {
            if(sc.hasNextInt()){
                i = sc.nextInt();
                switch (i) {
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

    private void ayuda() {
        System.out.println("Play and have fun");
    }
    
//    private int rollDie(){
//        return (int) (Math.random() * 6 + 1);
//    }
//    
//    @Override
//    public  int rollDice() {
//        System.out.println("Presiona ENTER para tirar los dados...");
//        sc.nextLine();
//        int d1 = rollDie();
//        int d2 = rollDie();
//        System.out.println(d1 + ", " + d2);
//        return d1 + d2;
//    }

    @Override
    public void printSquare(int posicion) {
        Casilla casilla = PerdidosEnElBosque.tablero.getTablero()[posicion];
        if(casilla==null){
            
        } else if(casilla.isCreature()){
            System.out.print("Has caido donde: " + casilla.getSquareName());
            System.out.println("\n" + casilla.getActionDescription());
        } else {
            System.out.print("Has caido en: " + casilla.getSquareName());
            System.out.println("\n" + casilla.getActionDescription());
        }
    }
                        
    @Override
    public void imprimirTablero(Casilla[] tablero) {
        for (int p = 0; p < tablero.length; p++) {
            if (p % 10 == 0) {
                System.out.println();
            }
            if (p == 0) {
                System.out.print("H ");
            } else if (p == PerdidosEnElBosque.getPlayer()[0].getPosicion()) {
                System.out.print("1 ");
            } else if (p == PerdidosEnElBosque.getPlayer()[1].getPosicion()){
                System.out.print("2 ");
            } else if (p == PerdidosEnElBosque.getPlayer()[2].getPosicion()){
                System.out.print("3 ");
            } else if (p == PerdidosEnElBosque.getPlayer()[3].getPosicion()){
                System.out.print("4 ");
            } else if (p == n1 || p == n2 || p == n3){
                System.out.print("~ ");
            } else if (tablero[p] == null) {
                System.out.print("* ");
            } else if (tablero[p].getPositionControl() < 0 || tablero[p].getTurnControl()<0){
                System.out.print("x ");
            } else {
                System.out.print("o ");
            }
        }
        System.out.println("");
    }

    @Override
    public void whoIsPlaying(int i) {
        System.out.println("Turno del jugador " + (i+1));
    }

    @Override
    public void imprimirGanador(int i) {
        System.out.println("Felicitaciones, el jugador " + (i+1) + " ha ganado!");
    }

    @Override
    public void print(String string) {
        System.out.println(string);
    }
}
