package RedFerroviaria;
import Decorator.Caracteristica;
import Tren.Tren;


public class Via implements Conexion{

	private Caracteristica caracteristica;
	private double longitud;
	private Object conexion1;
	private Object conexion2;
	
	public Via(double l,Object e1, Object e2, Caracteristica c){//constructor completo
		this.longitud=l;
		this.conexion1=e1;
		this.conexion2=e2;
		caracteristica=c;
	}
	public Via(double l,Object e1, Object e2) {//constructor para el builder
		this.longitud=l;
		this.conexion1=e1;
		this.conexion2=e2;
	}
	
	public Via(Caracteristica c) {//constructor para decorator
		this.caracteristica=c;
	}
	
	public void asignarCaracteristica(Caracteristica c){
		caracteristica=c;
	}

	@Override
	public void ida(Tren t) {
		System.out.println("ida a la conexion uno");
		
	}

	@Override
	public void vuelta(Tren t) {
		System.out.println("ida a la conexion cero");
		
	}

	
}
