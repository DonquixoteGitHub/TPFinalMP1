package Facade;

import ChainOfResponsability.Manejador;
import Observer.Observado;
import Observer.Observador;
import Personal.Personal;

public class OperadorDeCabina extends Manejador implements Observador{

	public OperadorDeCabina(Manejador s) {
		super(s);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void actualizar(Observado o) {
		// TODO Auto-generated method stub
		
	}

	
	
	public boolean decidirSegunElClima(){
		System.out.println("El clima esta bueno...");
		super.decidirSegunElClima();
		return true;
		
	}

}
