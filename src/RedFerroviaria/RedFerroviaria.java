package RedFerroviaria;
import java.util.ArrayList;

import Tren.Tren;


public class RedFerroviaria {
private ArrayList<Tren> trenes;//en el ejercicio dice trenes pero creo que es Tren para el <>
private ArrayList<Estacion> estaciones;

//singleton
static RedFerroviaria unicaRed= null;
private RedFerroviaria() {}

public void agregarTren(Tren t){
	trenes.add(t);
}

public void agregarEstacion(Estacion e){
	estaciones.add(e);
}

public void asignarTrenAEstacion(Tren t, Estacion e){
	e.asignarTren(t);
}

public static RedFerroviaria getInstance() {//singleton
	if (unicaRed==null)
		unicaRed=new RedFerroviaria();
	return unicaRed;
}
}
