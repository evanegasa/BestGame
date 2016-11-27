package ui.frames;

import BusinessLogic.ControlJuego;
import BusinessLogic.PerdidosEnElBosque;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.*;
import java.io.IOException;
import java.util.Arrays;
import javax.imageio.ImageIO;
import javax.swing.*;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import ui.GUI;

public class TableroGUI extends JFrame{

    private static final long serialVersionUID = 1L;

    private static BufferedImage image, plainImage;
    private static BufferedImage [] jugadores;
    private static JPanel panel;
   
    
    public TableroGUI() {
        super("Perdidos en el Bosque Encantado");
        
        try {
            plainImage = ImageIO.read(TableroGUI.class.getResource("/imagenes/tablero.jpg"));
            
            BufferedImage player1 = ImageIO.read(TableroGUI.class.getResource("/imagenes/amarillo.png"));
            BufferedImage player2 = ImageIO.read(TableroGUI.class.getResource("/imagenes/azul.png"));
            BufferedImage player3 = ImageIO.read(TableroGUI.class.getResource("/imagenes/verde.png"));
            BufferedImage player4 = ImageIO.read(TableroGUI.class.getResource("/imagenes/rojo.png"));
            jugadores = new BufferedImage [] {player1, player2, player3, player4};
        } catch (IOException e) {
            System.err.println("No such  file in directory");
        }
            JPanel interfaz = new JPanel();
                interfaz.setSize(200, plainImage.getHeight() + 100);
                
            JButton b = new JButton("Roll Dice");
                b.addActionListener((ActionEvent ae) -> {
                    ControlJuego.setCanRoll(true);
                 });
                interfaz.add(b);
                
                panel = new JPanel(){
                
                @Override
                protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(plainImage, 0, 0, null);
                g.drawRect(20, 20, 45, 45);
                
            }
            };
                
            render();
            this.setPreferredSize(new Dimension(plainImage.getWidth() + 200, plainImage.getHeight() + 100));
            
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            System.out.println("llegamos al panel");
            
            interfaz.setOpaque(false);
            add(interfaz);
            add(panel);
            this.setVisible(true);
            this.pack();
            
    }
    
    public void render(){
        System.out.println("renderizando");
        
        image = plainImage;
        
        for (int i = 0; i < 4; i++) {
            int pos = PerdidosEnElBosque.getPlayer()[i].getPosicion();
            renderPlayer(i, GUI.xDir[pos], GUI.yDir[pos]);
        }
        
    }
    
    private static void renderPlayer(int player, int xPos, int yPos){
        int [] pixels = jugadores[player].getRGB(0, 0, 50, 50, null, 0, 50); 
        
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                if(pixels[i*50 +j] != 16777215 && pixels[i*50 +j] != 0)
                    image.setRGB(xPos + j - 25 , yPos + i - 35, pixels[i*50 + j]);
            }
        }
    }
}

