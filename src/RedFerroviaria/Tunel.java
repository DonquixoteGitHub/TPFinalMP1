package RedFerroviaria;

import Decorator.Caracteristica;
import Tren.Tren;

public class Tunel implements Conexion{

	private Caracteristica caracteristica;
	private int longitud;
	private String tipo;//de montaña. subterraneo. subfluvial
	
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
