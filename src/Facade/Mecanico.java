package Facade;

import ChainOfResponsability.Manejador;
import Mediator.Colega;
import Mediator.MediadorDeEstacion;
import Observer.Observado;
import Observer.Observador;
import Personal.Personal;

public class Mecanico extends Manejador implements Observador, Colega{

	
	MediadorDeEstacion mediador; //mediador
	public Mecanico(Manejador s, MediadorDeEstacion m) {
		super(s);
		mediador=m;
	}

	public void llegaUnTren(TrenFacade trenf) {
		trenf.existenFallas();
		trenf.revisarFrenos();
		trenf.recargarCombustible();
		trenf.hacerRevision();
		
	}

	@Override
	public void actualizar(Observado o) {
		// TODO Auto-generated method stub
		
	}
	public boolean cargarCombustible(){
		System.out.println("cargando combustible...");
		super.cargarCombustible();
		return true;
	}
	
	public boolean arreglarDesperfectoEnLocomotora(){
		System.out.println("Arreglando locomotora...");
		super.arreglarDesperfectoEnLocomotora();
		return true;
	}
	
	public boolean arreglarDesperfectoEnVagon(){
		System.out.println("Arreglando vagon...");
		super.arreglarDesperfectoEnVagon();
		return true;
	}

	//mediador
	public void pedirVacaciones() {
		mediador.nececitoVacaciones();
	}
	public void pedirAyudante() {
		mediador.necesitoUnAyudante();
	}
}

