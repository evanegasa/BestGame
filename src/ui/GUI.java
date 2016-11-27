package ui;

import BusinessLogic.PerdidosEnElBosque;
import ui.frames.PantallaInicio;
import Data.*;
import java.io.*;
import java.util.Arrays;
import javax.swing.*;
import ui.frames.TableroGUI;

public final class GUI implements InterfazGrafica {

    private JFrame f = new PantallaInicio();
    public static int[] xDir = new int[66], yDir = new int[66];
    private TableroGUI tablero;

    public GUI() {
        
        try {
            BufferedReader reader = new BufferedReader(new FileReader(System.getProperty("user.dir") + "/src/Data/Casillas.csv"));
            String line;
            int i = 0;
            while((line = reader.readLine()) != null){
                String [] coordinates  = line.split(", ");
                xDir[i] = Integer.parseInt(coordinates[0]);
                yDir[i] = Integer.parseInt(coordinates[1]);
                i++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        menu();
    }

    @Override
    public void imprimirGanador(int i) {
    }

    @Override
    public void imprimirTablero(Casilla[] casillas) {
        
        System.out.println("se esta imprimierdndo");
        if(tablero == null) tablero = new TableroGUI();
        else tablero.render();
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
