package RedFerroviaria;

import Decorator.Caracteristica;
import Tren.Tren;

public class Puente implements Conexion{

	private Caracteristica caracteristica;
	private int longitud;
	private String tipo;//de arco, atirantado, colgante, levadizo, etc
	
	public void asignarCaracteristica(Caracteristica c){
		caracteristica=c;
	}

	@Override
	public void ida(Tren t) {
		System.out.println("ida a la conexion uno");
		
	}

	@Override
	public void vuelta(Tren t) {
		System.out.println("ida a la conexion cero");		
	}
}
