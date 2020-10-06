package RedFerroviaria;

import Tren.Tren;

public class Bifurcacion implements Conexion{

	@Override
	public void ida(Tren t) {
		System.out.println("ida a la conexion uno");		
	}

	@Override
	public void vuelta(Tren t) {
		System.out.println("ida a la conexion cero");		
	}

}
