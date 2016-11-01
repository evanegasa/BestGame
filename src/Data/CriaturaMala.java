package Data;

public class CriaturaMala extends Criatura {
	private int casillasRetrocede;
	private int turnosPerdidos;

	public CriaturaMala(int casillasRetrocede, int turnosPerdidos, String nombre, String habilidad) {
		super(nombre, habilidad);
		this.casillasRetrocede = casillasRetrocede;
		this.turnosPerdidos = turnosPerdidos;
	}

	public int getCasillasRetrocede() {
		return casillasRetrocede;
	}

	public void setCasillasRetrocede(int casillasRetrocede) {
		this.casillasRetrocede = casillasRetrocede;
	}

	public int getTurnosPerdidos() {
		return turnosPerdidos;
	}

	public void setTurnosPerdidos(int turnosPerdidos) {
		this.turnosPerdidos = turnosPerdidos;
	}
}
