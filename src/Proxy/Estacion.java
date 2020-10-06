package Proxy;

import Personal.Personal;
import RedFerroviaria.Anden;
import RedFerroviaria.Conexion;
import Tren.Tren;

public interface Estacion {

	void idaDelTren();
	void vueltaDelTren();
	void llegaUnTren(Tren t);
	
	void agregarConexion(Conexion c);
	void agregarPersonal(Personal p);
	void agregarAnden(Anden a);
}
