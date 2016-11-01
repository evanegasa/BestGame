package Data;

public class CriaturaMala extends Criatura {

    private final int casillasRetrocede;
    private final int turnosPerdidos;

    public CriaturaMala(int casillasRetrocede, int turnosPerdidos, String nombre, String habilidad) {
        super(nombre, habilidad);
        this.casillasRetrocede = casillasRetrocede;
        this.turnosPerdidos = turnosPerdidos;
    }

    public int getCasillasRetrocede() {
        return casillasRetrocede;
    }
    
    public int getTurnosPerdidos() {
        return turnosPerdidos;
    }
}
