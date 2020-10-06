package Strategy;

import java.util.ArrayList;

public class UnoDeCada implements PoliticaDeAcceso{
	
	int siguiente=0;
	
	public int siguienteTren(ArrayList[] colas) {
		//falta chequear si la cola tiene o no trenes
		siguiente++;
		if(siguiente==colas.length)
			siguiente=0;
		return siguiente;
	}

}
