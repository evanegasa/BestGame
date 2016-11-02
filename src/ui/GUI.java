package ui;

import BusinessLogic.PerdidosEnElBosque;
import Data.Casilla;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class GUI implements InterfazGrafica {

    JFrame f = new JFrame("Perdidos en el bosque encantado");
    JPanel panel = new JPanel();
    Color color = Color.LIGHT_GRAY;
    Color backColor = Color.WHITE;
    
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

    public GUI(){
        
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
        f2.setLayout(new GridBagLayout());
        f2.getContentPane().setBackground(backColor);
        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f2.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2 - 85);
        f2.setResizable(false);
        f2.setVisible(true);
        
        JPanel p2 = new JPanel(new GridLayout(10, 10));
        
        
        
    
    
    }

    @Override
    public void menu() {
        f.setMinimumSize(new Dimension(350, 200));
        f.setPreferredSize(new Dimension(350, 200));
        f.setLayout(new GridBagLayout());
        f.getContentPane().setBackground(backColor);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocation(dim.width/2-f.getSize().width/2, dim.height/2-f.getSize().height/2 - 85);
        f.setResizable(false);
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
                    ayuda();
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
        panel.setBackground(backColor);

        f.add(panel, new GridBagConstraints());

        panel.add(b1);
        panel.add(b2);
        panel.add(b3);
        
        f.setVisible(true);
    }

    @Override
    public void print(String string) {
    }

    @Override
    public void printSquare(int posicion) {
    }

    @Override
    public int rollDice() {
        return 0;
    }

    @Override
    public void whoIsPlaying(int i) {
    }
    
    private void ayuda(){
        panel.removeAll();
        panel.setPreferredSize(f.getSize());
        panel.add(new JLabel("  Enjoy and have fun"));
        JButton b = new JButton("Return to Menu");
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                panel.removeAll();
                menu();
            }
        });
        panel.add(b);
        f.pack();
        f.repaint();
    }
    
}
