package Facade;

import ChainOfResponsability.Manejador;
import Iterator.Iterador;
import Iterator.IteradorDeVagones;
import Observer.Observado;
import Observer.Observador;
import Personal.Personal;
import Tren.Tren;
import Vagon.Vagon;

public class SupervisorDeEstacion extends Personal implements Observador{
	
	Manejador manejadorDeProblemas;
	
	public void setManejador(Manejador m) {
		this.manejadorDeProblemas=m;
	}
	
	public boolean verificarPartida(){
		manejadorDeProblemas.cargarCombustible();
		manejadorDeProblemas.controlarDisturbios();
		manejadorDeProblemas.decidirSegunElClima();
		
		return true;
	}
	
	public void llegaUnTren(TrenFacade trenf){
		
		trenf.horaDeArribo("hora");
		
		trenf.todoEnOrden();
		
		trenf.reportarEstadoParaProximoTramo();
		
		
	}

	public void llegaUnTren(Tren t) {
		Iterador iterador = t.crearIterdaor();
		while(!iterador.fin()) {
			Vagon v = (Vagon) iterador.actual();
			v.reportarEstado();
			iterador.siguiente();
		}
	}
	@Override
	public void firmarEntrada() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualizar(Observado o) {
		// TODO Auto-generated method stub
		
	}
}
