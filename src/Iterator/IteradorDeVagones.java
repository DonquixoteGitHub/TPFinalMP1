package Iterator;

import java.util.ArrayList;

import Tren.Tren;
import Vagon.Vagon;

public class IteradorDeVagones implements Iterador{
	ArrayList<Vagon> vagones;
	int indice=0;
	
	public IteradorDeVagones(Tren t) {
		vagones = t.getVagones();
	}

	@Override
	public void primero() {
		indice=0;
		
	}

	@Override
	public void siguiente() {
		indice++;
		
	}

	@Override
	public boolean fin() {
		
		return indice >= vagones.size();
	}

	@Override
	public Iterable<Vagon> actual() {
		
		return vagones.get(indice);
	}

}
