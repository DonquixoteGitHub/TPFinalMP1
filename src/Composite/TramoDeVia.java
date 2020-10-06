package Composite;

import java.util.ArrayList;

import RedFerroviaria.Conexion;
import Tren.Tren;

public class TramoDeVia implements Conexion{

	ArrayList<Conexion> hijos = new ArrayList();
	
	public void agregarHijo(Conexion c) {
		hijos.add(c);
	}
	@Override
	public void ida(Tren t) {
		for(int i=0; i<hijos.size();i++)
			hijos.get(i).ida(t);
		
		
	}

	@Override
	public void vuelta(Tren t) {
		for(int i = hijos.size()-1;i>=0;i--)
			hijos.get(i).vuelta(t);
		
	}

}
