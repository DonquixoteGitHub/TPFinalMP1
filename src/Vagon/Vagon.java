package Vagon;

import Flyweight.VagonPesoLigero;
import Prototype.PrototipoClonable;
import Visitor.Visitante;

public abstract class Vagon implements PrototipoClonable, VagonPesoLigero, Iterable {
	private int numero;
	private double longitud;
	private double peso;
	
	
	
	public Vagon(int numero){
		this.numero=numero;	
	}

	public abstract void enganchar();
	public void liberarFrenos(){
		System.out.println("Vagon "+getNumero()+": frenos liberados");
	}
	public int getNumero(){
		return this.numero;
	}
	public void reportarEstado() {//facade
		System.out.println("Listo para seguir");
	}	
	public void reportarProblemas() {//facade
		System.out.println("No hay problema alguno");
	}
	public void revisarFrenos() {
		System.out.println("Frenos funcionando correctamente");
	}

	public abstract Vagon clonar();
	
	//clase 10
	public abstract void visitar(Visitante v);
}
