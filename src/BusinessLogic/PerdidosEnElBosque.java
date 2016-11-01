
package BusinessLogic;

import Data.Dado;
import Data.Tablero;

public class PerdidosEnElBosque {

	public static void main (String [ ] args) {

		Dado d = new Dado();
		Dado e = new Dado();
		System.out.println(d.toString()+e.toString());
		Tablero tablero = new Tablero();

		tablero.imprimirTablero();
	}   

}
