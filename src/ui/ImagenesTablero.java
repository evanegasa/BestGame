package ui;

import javax.swing.ImageIcon;

public class ImagenesTablero {
    
    public ImageIcon icoImagen;

    public ImageIcon imagenTablero(int aux) {

        switch (aux) {

            case 1:
                icoImagen = new ImageIcon(getClass().getResource("/imagenes/Tablero/pasto.jpg"));
                break;
                
            case 2:
                icoImagen = new ImageIcon(getClass().getResource("/imagenes/Tablero/interrogacion.jpg"));
                break;
             
          
               
        }
        return icoImagen;
    }
    
    
    
    
}
