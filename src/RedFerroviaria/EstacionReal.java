package RedFerroviaria;



import java.util.ArrayList;

import Facade.Mecanico;
import Facade.OperarioDeCarga;
import Facade.PersonalDeSeguridad;
import Facade.SupervisorDeEstacion;
import Facade.TrenFacade;
import ForAdapter.RailroadTrack;
import Observer.Observado;
import Observer.Observador;
import Personal.Personal;
import Prototype.TrenClonable;
import Proxy.Estacion;
import Tren.Tren;

public class EstacionReal implements Conexion, Estacion, Observado {
	
	private ArrayList<Personal> personal;
	private ArrayList<Anden> anden;
	private String nombre;
	private ArrayList conexiones;
	private SupervisorDeEstacion supervisor;
	private Mecanico mecanico;
	private PersonalDeSeguridad seguridad;
	private OperarioDeCarga operarioDeCarga;
	Tren trenRecientementeLlegado;
	
	ArrayList<Observador> observadores=new ArrayList<Observador>();//observer 

public EstacionReal(ArrayList<Personal> p, ArrayList<Anden> a, String n, ArrayList c) {
	this.personal=p;
	this.anden=a;
	this.nombre=n;
	this.conexiones=c;
	
}
public EstacionReal(String nombre, ArrayList conexiones) {
	this.nombre=nombre;
	this.conexiones=conexiones;
	
}
public EstacionReal(String nombre){
	this.nombre=nombre;
}

public void agregarConexion(Via conexion){
	this.conexiones.add(conexion);
}

public void agregarPersonal(Personal p){
	this.personal.add(p);
}

public void agregarAnden(Anden a){
	this.anden.add(a);
}

public void llegaUnTren(Tren t){//facade
	//observer
	System.out.println("El tren ha llegado a la estacion");
	trenRecientementeLlegado=t;
	this.notificar();//observer
	//fin observer
	TrenFacade trenf = new TrenFacade(t);
	supervisor.llegaUnTren(trenf);
	anden.llegaUnTren(trenf);
}

public void asignarTren(TrenClonable t) {
	for(Anden a:anden)
		a.llegaUnTren((Tren)t.clonar());
	
}

@Override
public void ida(Tren t) {
	System.out.println("Ida del tren");
	this.llegaUnTren(t);
}

@Override
public void vuelta(Tren t) {
	System.out.println("Vuelta del tren");
	this.llegaUnTren(t);
	
}

public void idaDelTren(){
	System.out.println("ida a la conexion uno");
}

public void vueltaDelTren(){
	System.out.println("vuelta ala conexion cero");
}

public void addConnection0(RailroadTrack track) {
}

public void addConnection1(RailroadTrack track) {
}

public void generarNombres() {
	
}
@Override
public void agregarConexion(Conexion c) {
	// TODO Auto-generated method stub
	
}
public void agregar(Observador o) {
	observadores.add(o);
}
public void quitar(Observador o) {
	observadores.remove(o);
}

public void notificar() {
	for(Observador o:observadores)
		o.actualizar(this);
}
	
}
