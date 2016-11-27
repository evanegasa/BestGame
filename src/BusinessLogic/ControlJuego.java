package BusinessLogic;

import java.util.Scanner;

public class ControlJuego {
    
    private static Scanner sc = new Scanner(System.in);
    private static boolean canRoll = false;
   
    public static int rollDice() {
        while(true){
            if(canRoll){
                break;
            }
        }
        
        return (int) (Math.random() * 6 + 1);
    }

    public static boolean canRoll() {
        return canRoll;
    }

    public static void setCanRoll(boolean canRoll) {
        ControlJuego.canRoll = canRoll;
    }
}
