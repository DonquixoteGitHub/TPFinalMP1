package Strategy;

import java.util.ArrayList;

import Tren.Tren;

public class ControladorDeSemaforos {//clase que utilizara las politicas de acceso como interfaz

	PoliticaDeAcceso politica;//se define como interfaz, las clases que contienen los algoritmos implementan dicha interfaz
	ArrayList<Tren>[] colasDeTrenes= new ArrayList(5);
	
	public ControladorDeSemaforos() {
		//como politica inicial cuando se instancia se define como uno de cada uno
		//a futuro se puede definir otra politica con "cambiarPolitica
		politica=new UnoDeCada();
		
	}
	
	public Tren siguienteTren() {//aplica la politica actual
		int cola = politica.siguienteTren(colasDeTrenes);// ejecuta la politica concreta
		Tren tren=colasDeTrenes[cola].get(0);
		colasDeTrenes[cola].remove(0);
		return tren;//retorna el tren de la cola
	}
	
	public void cambiarPolitica(PoliticaDeAcceso pa) {
		//si se quiere cambiar de politica, simplemente se la define en el argumento de la funcion
		politica=pa;
	}
}
