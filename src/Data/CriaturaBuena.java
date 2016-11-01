package Data;

public class CriaturaBuena extends Criatura {

    private final int casillasAvanza;
    private final int turnosExtra;

    public CriaturaBuena(int casillasAvanza, int turnosExtra, String nombre, String habilidad) {
        super(nombre, habilidad);
        this.casillasAvanza = casillasAvanza;
        this.turnosExtra = turnosExtra;
    }

    public int getCasillasAvanza() {
        return casillasAvanza;
    }

    public int getTurnosExtra() {
        return turnosExtra;
    }
}