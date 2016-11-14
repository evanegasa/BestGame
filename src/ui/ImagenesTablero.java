/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.ImageIcon;

/**
 *
 * @author Juansebastian
 */
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
