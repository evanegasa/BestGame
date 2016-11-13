package ui;

import ui.frames.PantallaInicio;
import BusinessLogic.PerdidosEnElBosque;
import Data.Casilla;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public final class GUI implements InterfazGrafica {

    private JFrame f = new PantallaInicio();
    private JPanel panel = new JPanel();
    private Color color = Color.LIGHT_GRAY;
    //private Color backColor = Color.PINK;
    private BufferedImage pantallaInicio;

    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    public GUI() {

        menu();
    }

    @Override
    public void imprimirGanador(int i) {
    }

    @Override
    public void imprimirTablero(Casilla[] tablero) {
        JFrame f2 = new JFrame();
        f2.setMinimumSize(new Dimension(600, 400));
        f2.setPreferredSize(new Dimension(600, 400));
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setLocation(dim.width / 2 - f.getSize().width / 2, dim.height / 2 - f.getSize().height / 2 - 85);
        f2.setResizable(false);
        f2.setVisible(true);

        JPanel p2 = new JPanel(new GridLayout(10, 10));

    }

    @Override
    public void menu() {

        f.setLocation(dim.width / 2 - f.getSize().width / 2, dim.height / 2 - f.getSize().height / 2 - 85);
        f.setVisible(true);

        JButton b1 = new JButton("Jugar");
        b1.setBackground(color);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                PerdidosEnElBosque.jugar();
            }
        });
        JButton b2 = new JButton("Ayuda");
        b2.setBackground(color);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                //ayuda();
            }
        });

        JButton b3 = new JButton("Salir");
        b3.setBackground(color);
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        
        panel.setLayout(new GridLayout(3, 3, 0, 10));
        panel.setPreferredSize(new Dimension(100, 130));
        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        //panel.setBackground(backColor);

    }

    @Override
    public void print(String string) {
    }

    @Override
    public void printSquare(int posicion) {
    }

//    @Override
//    public int rollDice() {
//        return 0;
//    }
    @Override
    public void whoIsPlaying(int i) {
    }

 

}
