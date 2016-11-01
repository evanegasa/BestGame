package BusinessLogic;

public class ControlTurno {

    public static int rollDice(){
        return (int) (Math.random() * 6 + 1);
    }
    
}
