package Data;

public class CriaturaBuena extends Criatura  {
	private int casillasAvanza;
	private int turnosExtra;

	public CriaturaBuena(int casillasAvanza, int turnosExtra, String nombre, String habilidad) {
		super(nombre, habilidad);
		this.casillasAvanza = casillasAvanza;
		this.turnosExtra = turnosExtra;
	}

	public int getCasillasAvanza() {
		return casillasAvanza;
	}

	public void setCasillasAvanza(int casillasAvanza) {
		this.casillasAvanza = casillasAvanza;
	}

	public int getTurnosExtra() {
		return turnosExtra;
	}

	public void setTurnosExtra(int turnosExtra) {
		this.turnosExtra = turnosExtra;
	}  

}
