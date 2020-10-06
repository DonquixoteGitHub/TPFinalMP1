package Programa;
import java.util.Scanner;
import java.util.ArrayList;

import Builder.ConstructorDeEscenarioAbstracto;
import Builder.ConstructorDeEscenarioSencillo;
import Builder.DirectorDeEscenarios;
import Composite.TramoDeVia;
import Decorator.ActivarBarreras;
import Decorator.ActivarSemaforo;
import Decorator.AvesQueSeEspantan;
import Decorator.Caracteristica;
import Decorator.CaracteristicaEnComun;
import Decorator.DurmientesFlojos;
import Facade.Mecanico;
import Facade.SupervisorDeEstacion;
import Iterator.IteradorDeVagones;
import Locomotora.Locomotora;
import Maquinista.Maquinista;
import Proxy.Estacion;
import RedFerroviaria.EstacionReal;
import RedFerroviaria.Puente;
import RedFerroviaria.RedFerroviaria;
import RedFerroviaria.Tunel;
import RedFerroviaria.Via;
import Tren.Tren;
import Tren.TrenAbstractFactory;
import Tren.TrenDeCarga;
import Tren.TrenDePasajeros;
import Tren.TrenHistorico;
import Vagon.Vagon;
import Visitor.Visitante;
public class Programa {

	static Scanner teclado=new Scanner(System.in);
	
	public static void main(String[] args) {
		ejecutarDecorator();
		
		System.out.println("programa terminado");

	}
	
	public static void DecoratorImplementacion(){
		Caracteristica accion = new CaracteristicaEnComun();
		accion=new ActivarSemaforo(accion);
	}
	
	public static void crearTren(){
		TrenAbstractFactory fabrica=null;
		int opcion=teclado.nextInt();
		switch(opcion){
			case 1:
				fabrica=new TrenDePasajeros();
				break;
			case 2:
				fabrica=new TrenDeCarga();
				break;
			case 3:
				fabrica=new TrenHistorico();
				
		}
		
		Tren t=new Tren();
		Maquinista m = fabrica.crearMaquinista();
		Locomotora l = fabrica.crearLocomotora();
		l.setMaquinista(m);
		Vagon v;
		for(int i=0; i<5 ; i++){
			t.agregarVagon(fabrica.crearVagon());
		}
		t.agregarLocomotora(l);
		t.realizarRecorrido();
	}
	
	public static void crearRed(){
		ConstructorDeEscenarioAbstracto crf = new ConstructorDeEscenarioSencillo();
		RedFerroviaria rf = DirectorDeEscenarios.construirRedSimple(crf);
		
	}
	
	public static void crearEscenarioCuadrado(){//hacer
		ConstructorDeEscenarioAbstracto crf = new ConstructorDeEscenarioSencillo();
		RedFerroviaria rf = DirectorDeEscenarios.construirRedSimple(crf);
		crf.construirEstacion("estacion a");
		crf.construirEstacion("estacion b");
		
	}
	
	public static void crearEscenarioCuadradoDoble(){//hacer
		
	}
	
	//HACER EJERCICIO 4 DE LA TEORIA 4(FILMINA 11)
	public static void viajesDelTren(){
		
	}

	/*public static void crearTren(){
		int opcion;
		Tren tren=new Tren();
		System.out.println("ingrese el nombre del maquinista");
		Maquinista m = new Maquinista(teclado.nextLine());
		
		System.out.println("ingrese el tipo de locomotora a crear");
		System.out.println("1- locomotora Diesel");
		System.out.println("2- locomotora Electrica");
		opcion=teclado.nextInt();
		Locomotora l;
		switch(opcion){
		case 1:
			l= new LocomotoraDiesel();
		case 2:
			l=new LocomotoraElectrica();
		}
		
		System.out.println("ingrese el tipo de vagon a crear");
		System.out.println("Vagon de pasajeros");
		System.out.println("Vagon de carga");
		opcion=teclado.nextInt();
		
		switch(opcion){
		case 1:
			System.out.println("ingrese la cantidad de vagones a crear");
			opcion=teclado.nextInt();
			for(int i=0;i<=opcion;i++){
				tren.agregarVagon(new VagonDePasajeros(i));
			}
			
		case 2:
			System.out.println("ingrese la cantidad de vagones a crear");
			opcion=teclado.nextInt();
			for(int i=0;i<=opcion;i++){
				tren.agregarVagon(new VagonDeCarga(i));
			}
			
		}
		
		
		
	}*/
	
	//ejemplo composite
	/*public static void generarComposite() {
		Via v1 = new Via(20);
		Puente p1 = new Puente(30);
		Tunel t1 = new Tunel(12);
		TramoDeVia tv1 = new TramoDeVia();
		tv1.agregarHijo(v1);
		tv1.agregarHijo(p1);
		tv1.agregarHijo(t1);
		Via v2 = new Via(48);
		Via v31 = new Via(20);
		Via v32 = new Via(12);
		Puente p3 = new Puente(30);
		Tunel t3 = new Tunel(12);
		TramoDeVia tv3 = new TramoDeVia();
		tv3.agregarHijo(v31);
		tv3.agregarHijo(v32);
		tv3.agregarHijo(p3);
		tv3.agregarHijo(t3);
		TramoDeVia tv = new TramoDeVia(estacion1, estacion2);
		tv.agregarHijo(tv1);
		tv.agregarHijo(v2);
		tv.agregarHijo(tv3);
	}*/
	
	public static void ejecutarDecorator() {
		Caracteristica accion = new CaracteristicaEnComun();
		accion = new ActivarSemaforo(accion);
		accion = new ActivarBarreras(accion);
		accion = new DurmientesFlojos(accion);
		accion = new AvesQueSeEspantan(accion);
		
		Via via = new Via(accion);
	}
	
	public static void observerSuscribir() {
		EstacionReal e=new EstacionReal("prueba");
		
		Mecanico m = new Mecanico();
		e.agregar(m);
		
		SupervisorDeEstacion s = new SupervisorDeEstacion();
		e.agregar(s);
		
	}
	
	//visitor implementacion clase 10
	public void revisar(Tren tren) {
		Visitante visitante=new VisitanteLimpieza(this);
		IteradorDeVagones ite = t.crearIterador();
		while(!ite.fin()) {
			Vagon v = (Vagon)ite.siguiente();
			v.visitar(visitante);
		}
	}
}
