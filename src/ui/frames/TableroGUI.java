package ui.frames;

import java.awt.*;
import java.awt.image.*;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;

public class TableroGUI extends JFrame{

    private static final long serialVersionUID = 1L;

    private static BufferedImage image;
    
    public TableroGUI() {
        super("Perdidos en el Bosque Encantado");
        
        try {
            image = ImageIO.read(TableroGUI.class.getResource("/imagenes/tablero.jpg"));
        } catch (IOException e) {
            System.err.println("No such  file in directory (Tablero.jpg)");
        }
        
        render();
 
        setPreferredSize(new Dimension(image.getWidth(), image.getHeight()));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        pack();
        setLocationRelativeTo(null);
    }
    
    public void render(){
        
        int xCoor = 124;
        int yCoor = 596;
        int color = Color.RED.getRGB();
        
        for (int i = 0; i < 30; i++) {
            for (int j = -3-i; j < i+3; j++) {
                image.setRGB(xCoor + j, yCoor + i -20, color);
            }
        }
        
        JPanel panel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, null);
            }
        };
        add(panel);
        pack();
    }
}

