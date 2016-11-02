package ui;

import Data.Casilla;


public interface InterfazGrafica {

    void imprimirGanador(int i);

    void imprimirTablero(Casilla[] tablero);

    void menu();

    void print(String string);

    void printSquare(int posicion);

    int rollDice();

    void whoIsPlaying(int i);
    
}
