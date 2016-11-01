package Data;

public class CriaturaNeutra extends Criatura{
	private String habilidadDos;
	private int casillasAvRe;
	private int turnosExpe;

	public CriaturaNeutra(String habilidadDos, int casillasAvRe, int turnosExpe, String nombre, String habilidad) {
		super(nombre, habilidad);
		this.habilidadDos = habilidadDos;
		this.casillasAvRe = casillasAvRe;
		this.turnosExpe = turnosExpe;
	}

	public String getHabilidadDos() {
		return habilidadDos;
	}

	public void setHabilidadDos(String habilidadDos) {
		this.habilidadDos = habilidadDos;
	}

	public int getCasillasAvRe() {
		return casillasAvRe;
	}

	public void setCasillasAvRe(int casillasAvRe) {
		this.casillasAvRe = casillasAvRe;
	}

	public int getTurnosExpe() {
		return turnosExpe;
	}

	public void setTurnosExpe(int turnosExpe) {
		this.turnosExpe = turnosExpe;
	}

}
