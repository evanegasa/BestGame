package ui;

import Data.Casilla;


public interface InterfazGrafica {

    public void imprimirGanador(int i);

    void imprimirTablero(Casilla[] tablero);

    void menu();

    void print(String string);

    void printSquare(int posicion);

    //public int rollDice();

    void whoIsPlaying(int i);
    
}
