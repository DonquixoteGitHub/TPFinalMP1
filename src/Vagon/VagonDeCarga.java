package Vagon;

import java.util.ArrayList;
import java.util.Iterator;

import Flyweight.VagonPesoLigero;
import Visitor.Visitante;

public class VagonDeCarga extends Vagon{
	
	private String tipoDeCarga;
	private String carga;
	
	private ArrayList<VagonPesoLigero> vagones;

	public VagonDeCarga(int numero, String tipoDeCarga) {
		super(numero);
		this.tipoDeCarga=tipoDeCarga;
		
	}

	@Override
	public void enganchar() {
		System.out.println("vagon de carga "+getNumero()+" enganchado");
		
	}
	
	public int getNumero(){
		return super.getNumero();
	}

	@Override
	public Vagon clonar() {
		return new VagonDeCarga(this.getNumero(),this.tipoDeCarga);
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void visitar(Visitante v) {
		v.visitarVagonDeCarga(this);
	}

	
	

}
