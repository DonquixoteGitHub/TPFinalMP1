package Vagon;

import java.util.Iterator;

import Visitor.Visitante;

public class VagonDePasajerosAntiguo extends Vagon{
	
	private int añoDeCreacion;

	public VagonDePasajerosAntiguo(int numero, int añoDeCreacion) {
		super(numero);
		this.añoDeCreacion=añoDeCreacion;
		
	}

	@Override
	public void enganchar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vagon clonar() {
		return new VagonDePasajerosAntiguo(this.getNumero(), this.añoDeCreacion);
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void visitar(Visitante v) {
		v.visitarVagonHistorico(this);
	}

}
