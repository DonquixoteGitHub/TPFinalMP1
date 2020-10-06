package ChainOfResponsability;

public abstract class Manejador {

	Manejador sucesor=null;
	
	public Manejador(Manejador s) {
		sucesor=s;
	}
	
	 public boolean cargarCombustible(){
		if (sucesor !=null)
			return sucesor.cargarCombustible();
		else
			return false;
	}
	 public boolean arreglarDesperfectoEnLocomotora(){
		if (sucesor !=null)
			return sucesor.arreglarDesperfectoEnLocomotora();
		else
			return false;
	}
	 public boolean arreglarDesperfectoEnVagon(){
		if (sucesor !=null)
			return sucesor.arreglarDesperfectoEnVagon();
		else
			return false;
	}
	 public boolean controlarDisturbios(){
		if (sucesor !=null)
			return sucesor.controlarDisturbios();
		else
			return false;
	}
	 public boolean ubicarPasajeros(){
		if (sucesor !=null)
			return sucesor.ubicarPasajeros();
		else
			return false;
	}
	 public boolean decidirSegunElClima(){
		if (sucesor !=null)
			return sucesor.decidirSegunElClima();
		else
			return false;
	}
}
