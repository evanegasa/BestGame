package Data;

public class CasillaEspecial extends Casilla {

	private Criatura criatura;
	private int variacionCasillas;
	private String nombreCasilla;

	public CasillaEspecial(Criatura criatura, int posicion) {
		super(posicion);
		this.criatura = criatura;
	}

	public CasillaEspecial(int variacionTurnos, String nombreCasilla, int posicion) {
		super(posicion);
		this.variacionCasillas = variacionTurnos;
		this.nombreCasilla = nombreCasilla;
	}
}