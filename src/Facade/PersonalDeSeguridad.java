package Facade;

import ChainOfResponsability.Manejador;
import Observer.Observado;
import Observer.Observador;
import Personal.Personal;

public class PersonalDeSeguridad extends Manejador implements Observador{

	public PersonalDeSeguridad(Manejador s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	public void llegaUnTren(TrenFacade trenf) {
		trenf.todoEnOrden();
		
		trenf.reportarProblemas();
	}

	

	@Override
	public void actualizar(Observado o) {
		// TODO Auto-generated method stub
		
	}
	
	public boolean controlarDisturbios(){
		System.out.println("disturbios controlados...");
		super.controlarDisturbios();
		return true;
	}
	
	public boolean ubicarPasajeros(){
		System.out.println("ubicando pasajeros...");
		super.ubicarPasajeros();
		return true;
	}
}
