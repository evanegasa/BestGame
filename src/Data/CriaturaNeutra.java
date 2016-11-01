package Data;

public class CriaturaNeutra extends Criatura {

    private final String habilidadDos;
    private final int casillasAvRe;
    private final int turnosExpe;

    public CriaturaNeutra(String habilidadDos, int casillasAvRe, int turnosExpe, String nombre, String habilidad) {
        super(nombre, habilidad);
        this.habilidadDos = habilidadDos;
        this.casillasAvRe = casillasAvRe;
        this.turnosExpe = turnosExpe;
    }

    public String getHabilidadDos() {
        return habilidadDos;
    }
    
    public int getCasillasAvRe() {
        return casillasAvRe;
    }

    public int getTurnosExpe() {
        return turnosExpe;
    }
}
