package Data;

public class Tablero {

    private final int numeroCasillas = 100;
    private Casilla[] tablero;

    public static CriaturaBuena a = new CriaturaBuena(5, 0, "Hada del pantano", "Hacerte avanzar");
    public static CriaturaBuena b = new CriaturaBuena(0, 1, "Duende de la suerte", "Turno extra");
    public static CriaturaBuena c = new CriaturaBuena(8, 0, "Ninfa de la laguna", "Hacerte avanzar");
    public static CriaturaBuena d = new CriaturaBuena(5, 0, "El sabio hermitaño", "Dos turnos extras");
    public static CriaturaMala f = new CriaturaMala(0, 2, "El minotauro", "Pierdes dos turnos");
    public static CriaturaMala g = new CriaturaMala(0, 2, "El dragon", "Pierdes turnos");
    public static CriaturaMala h = new CriaturaMala(8, 0, "El gran monstruo del bosque", "Retrocede casillas");

    public Tablero() {

        tablero = new Casilla[numeroCasillas];
        tablero[13] = new Casilla(a, 13);
        tablero[24] = new Casilla(b, 24);
        tablero[56] = new Casilla(c, 56);
        tablero[87] = new Casilla(d, 87);
        tablero[19] = new Casilla(f, 19);
        tablero[43] = new Casilla(g, 43);
        tablero[60] = new Casilla(h, 60);

        tablero[5] = new Casilla(2, "Puente arcoiris", 5);
        tablero[30] = new Casilla(1, "Puente roto", 30);
        tablero[72] = new Casilla(2, "Tronco caido", 72);

    }

    public void imprimirTablero() {
        for (int p = 0; p < tablero.length; p++) {
            if ((p) % 10 == 0) {
                System.out.println();
            }
            if (tablero[p] == null) {
                System.out.print("* ");

            } else if (tablero[p].isCriatura()) {
                System.out.print("o ");
            } else {
                System.out.print("& ");
            }
        }
    }

    public Casilla[] getTablero() {
        return tablero;
    }
    
}