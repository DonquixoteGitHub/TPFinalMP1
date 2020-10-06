package Vagon;

import java.util.Iterator;

import Visitor.Visitante;

public class VagonDePasajeros extends Vagon {

	private int capacidad;
	private int asientos;
	
	public VagonDePasajeros(int numero, int capacidad) {
		super(numero);
		this.capacidad=capacidad;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void enganchar() {
		System.out.println("vagon de pasajeros "+getNumero()+" enganchado");
		
	}
	
	public int getNumero(){
		return super.getNumero();
	}

	@Override
	public Vagon clonar() {
		return new VagonDePasajeros(this.getNumero(),this.capacidad);
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void visitar(Visitante v) {
		v.visitarVagonDePasajeros(this);
		
	}

}
