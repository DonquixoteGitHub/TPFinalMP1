package Command;

import Decorator.Caracteristica;

public class Detector implements Caracteristica{

	Orden orden;
	
	public Detector(Orden o) {
		orden=o;
	}
	
	public void setOrden(Orden o) {
		orden=o;
	}
	
	public void pasaElTren() {
		orden.ejecutar();
	}
}
