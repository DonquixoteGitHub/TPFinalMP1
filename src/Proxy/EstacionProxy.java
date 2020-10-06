package Proxy;

import java.util.ArrayList;

import Personal.Personal;
import RedFerroviaria.Anden;
import RedFerroviaria.Conexion;
import RedFerroviaria.EstacionReal;
import Tren.Tren;

public class EstacionProxy implements Estacion {

	private Estacion estacionReal=null;
	private ArrayList<Conexion> conexiones;
	private ArrayList<Personal> personal;
	private ArrayList<Anden> andenes;
	
	@Override
	public void idaDelTren() {
		// TODO Auto-generated method stub

	}

	@Override
	public void vueltaDelTren() {
		// TODO Auto-generated method stub

	}

	@Override
	public void llegaUnTren(Tren t) {
		if(estacionReal==null) {
			estacionReal=new EstacionReal(null);
			for(Anden a : andenes)
				//algo no concuerda, preguntar al profesor el patron proxy
				//filmina 40 de la teoria 6
				
		}
		estacionReal.llegaUnTren(t);

	}

	@Override
	public void agregarConexion(Conexion c) {
		conexiones.add(c);

	}

	@Override
	public void agregarPersonal(Personal p) {
		if(estacionReal==null)
			personal.add(p);
		else
			estacionReal.agregarPersonal(p);

	}

	@Override
	public void agregarAnden(Anden a) {
		if(estacionReal==null)
			andenes.add(a);
		else
			estacionReal.agregarAnden(a);

	}

}
