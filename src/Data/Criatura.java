package Data;

public abstract class Criatura {
	private String nombre;
	private String habilidad;
	//private Casilla casilla;

	public Criatura(String nombre, String habilidad) {
		this.nombre = nombre;
		this.habilidad = habilidad;
		//this.casilla = casilla;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getHabilidad() {
		return habilidad;
	}

	public void setHabilidad(String habilidad) {
		this.habilidad = habilidad;
	}

	// public Casilla getCasilla() {
	//  return casilla;
	//}

	//    public void setCasilla(Casilla casilla) {
	//   this.casilla = casilla;
	//}


}
