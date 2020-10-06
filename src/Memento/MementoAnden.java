package Memento;

import RedFerroviaria.Anden;

public class MementoAnden {

	EstadoAnden estado;
	
	public void obtenerEstado(Anden a) {
		estado=a.getEstado();
	}
	
	public void establecerEstado(Anden a) {
		a.setEstado(estado);
	}
}
