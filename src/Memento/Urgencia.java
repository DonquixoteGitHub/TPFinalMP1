package Memento;

import RedFerroviaria.Anden;

public class Urgencia {

	private MementoAnden memento;
	
	private void cambiarAnden(Anden anden) {
		memento = anden.crearMemento();
		//...
		anden.setEstado(new EstadoAndenDePaso());
	}
	
	private void volverAEstadoAnterior(Anden anden) {
		memento.establecerEstado(anden);
	}
}
