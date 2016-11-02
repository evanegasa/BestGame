package Data;

import ui.UI;

public class Tablero {

    private final int numeroCasillas = 100;
    private Casilla[] tablero;

    public Tablero() {
        tablero = new Casilla[numeroCasillas];
        tablero[13] = new Casilla("Hada del pantano", 5, 0, "Avanzas 5 casillas", true);
        tablero[24] = new Casilla("Duende de la suerte", 0, 1, "Tienes 1 lanzamiento extra", true);
        tablero[56] = new Casilla("Ninfa de la laguna", 8, 0, "Avanzas 8 casillas", true);
        tablero[87] = new Casilla("El sabio hermitaño", 0, 2, "Tienes 2 lanzamientos extras", true);

        tablero[19] = new Casilla("El minotauro", 0, -2, "Pierdes dos turnos", true);
        tablero[43] = new Casilla("El dragon", 0, -2, "Pierdes dos turnos", true);
        tablero[98] = new Casilla("El gran monstruo del bosque", -20, 0, "Retrocedes 8 casillas", true);

        tablero[5]  = new Casilla("Puente arcoiris", 15, 0, "Avanzas 15 casillas", false);
        tablero[30] = new Casilla("Puente roto", -15, 0, "Retrocedes 15 casillas", false);
        tablero[70] = new Casilla("Tronco caido", 0, -1, "Pierdes 1 turno", false);
    }

    public Casilla[] getTablero() {
        return tablero;
    }
    
    public Casilla elfoEnigma() {
        String mensaje = "";
        if(UI.rollDice() >= 6){
            return new Casilla("Elfo enignma", 0, -1, "Pierdes un turno", true);
        } 
        return null;
    }

    public Casilla magoMontana() {
        if(UI.rollDice() >= 8){
            return new Casilla("", 10, 0, "Avanzas 10 casillas", true);
        } 
            return new Casilla("", -14, 0, "Retrocedes 14 casillas", true);
    }

    public Casilla Dragon() {
        if(UI.rollDice()%2 == 0){
            return null;
        }else{
            return new Casilla("", 0, -3, "Pierdes 3 turnos",true);
        }
    }
}