package ui;

import ui.frames.PantallaInicio;
import Data.Casilla;
import javax.swing.*;

public final class GUI implements InterfazGrafica {

    private JFrame f = new PantallaInicio();

    public GUI() {
        menu();
    }

    @Override
    public void imprimirGanador(int i) {
    }

    @Override
    public void imprimirTablero(Casilla[] tablero) {
    }

    @Override
    public void menu() {
        f.setName("Perdidos en el Bosque Encantado");
        f.setVisible(true);
        f.setLocationRelativeTo(null);
    }

    @Override
    public void print(String string) {
    }

    @Override
    public void printSquare(int posicion) {
    }

    @Override
    public void whoIsPlaying(int i) {
    }

}
