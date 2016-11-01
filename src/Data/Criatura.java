package Data;

public abstract class Criatura {

    private final String nombre;
    private final String habilidad;

    public Criatura(String nombre, String habilidad) {
        this.nombre = nombre;
        this.habilidad = habilidad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getHabilidad() {
        return habilidad;
    }
}
