package Data;

public class Casilla {

    private final int posicion;
    private Criatura criatura;
    private int variacionCasillas;
    private String nombreCasilla;
    private boolean hayCriatura;

    public Casilla(int posicion) {
        this.posicion = posicion;
        hayCriatura = false;
    }

    public Casilla(Criatura criatura, int posicion) {
        this.posicion = posicion;
        this.criatura = criatura;
        this.nombreCasilla = criatura.getNombre();
        hayCriatura = true;
    }

    public Casilla(int variacionTurnos, String nombreCasilla, int posicion) {
        this.posicion = posicion;
        this.variacionCasillas = variacionTurnos;
        this.nombreCasilla = nombreCasilla;
        hayCriatura = false;
    }

    public boolean isCriatura() {
        return hayCriatura;
    }

    public String getNombreCasilla() {
        return nombreCasilla;
    }
    
    
    
}
