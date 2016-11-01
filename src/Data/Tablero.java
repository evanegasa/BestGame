package Data;

public class Tablero {

    private final int numeroCasillas = 100;
    private Casilla[] tablero;

    public static CriaturaBuena a = new CriaturaBuena(5, 0, "Hada del pantano", "Hacerte avanzar");
    public static CriaturaBuena b = new CriaturaBuena(0, 1, "Duende de la suerte", "Turno extra");
    public static CriaturaBuena c = new CriaturaBuena(8, 0, "Ninfa de la laguna", "Hacerte avanzar");
    public static CriaturaBuena d = new CriaturaBuena(5, 0, "El sabio hermitaño", "Dos turnos extras");
    public static CriaturaMala f = new CriaturaMala(0, 2, "El minotauro", "Pierdes dos turnos");
    public static CriaturaMala g = new CriaturaMala(8, 0, "El dragon", "Pierdes turnos");
    public static CriaturaMala h = new CriaturaMala(0, 2, "El gran monstruo del bosque", "Retrocede casillas");
    //public static Casilla i = new CasillaEspecial(15, "Puente arcoiris");
    //public static Casilla j = new CasillaEspecial(15, "Puente roto");
    //public static Casilla k = new CasillaEspecial(5, "Tronco caido");

    public Tablero() {

        tablero = new Casilla[numeroCasillas];
        tablero[13] = new CasillaEspecial(a, 13);
        tablero[24] = new CasillaEspecial(b, 24);
        tablero[56] = new CasillaEspecial(c, 56);
        tablero[87] = new CasillaEspecial(d, 87);
        tablero[19] = new CasillaEspecial(f, 19);
        tablero[43] = new CasillaEspecial(g, 43);
        tablero[60] = new CasillaEspecial(h, 60);
        //tablero[5] = new CasillaEspecial(h, 5);
        //tablero[30] = new CasillaEspecial(h,30);
        //tablero[72] = new CasillaEspecial(h,72);

    }

    public void imprimirTablero() {
        for (int p = 0; p < tablero.length; p++) {
            if ((p) % 10 == 0) {
                System.out.println();

            }
            if (tablero[p] == null) {
                System.out.print("* ");

            } else if (tablero[p] != null) {
                System.out.print("o ");
            }
        }
    }
}