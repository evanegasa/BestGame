/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLogic;

import java.util.Scanner;

/**
 *
 * @author Juansebastian
 */
public class ControlJuego {
    
    private static Scanner sc = new Scanner(System.in);
            
    private static int rollDie(){
        return (int) (Math.random() * 6 + 1);
    }
    
   
    public  static int rollDice() {
        
        int d1 = rollDie();
        return d1;
    }
    
}
