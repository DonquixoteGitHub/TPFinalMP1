package Vagon;

import java.util.Iterator;

import Visitor.Visitante;

public class VagonDePasajerosAntiguo extends Vagon{
	
	private int a�oDeCreacion;

	public VagonDePasajerosAntiguo(int numero, int a�oDeCreacion) {
		super(numero);
		this.a�oDeCreacion=a�oDeCreacion;
		
	}

	@Override
	public void enganchar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vagon clonar() {
		return new VagonDePasajerosAntiguo(this.getNumero(), this.a�oDeCreacion);
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
