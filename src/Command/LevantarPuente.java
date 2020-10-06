package Command;

import RedFerroviaria.Puente;

public class LevantarPuente implements Orden{

	Puente puente;
	
	public LevantarPuente(Puente p) {
		puente=p;
	}
	
	@Override
	public void ejecutar() {
		puente.levantar();
		
	}

}
