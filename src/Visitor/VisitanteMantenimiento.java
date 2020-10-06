package Visitor;

import Vagon.VagonDeCarga;
import Vagon.VagonDePasajeros;
import Vagon.VagonDePasajerosAntiguo;

public class VisitanteMantenimiento implements Visitante{

	@Override
	public void visitarVagonDeCarga(VagonDeCarga vagon) {
		vagon.desatascarTolva();
		vagon.repararCompuertas();
		
	}

	@Override
	public void visitarVagonDePasajeros(VagonDePasajeros vagon) {
		vagon.destrabajrPuertas();
		vagon.atornillarAsientos();
		
	}

	@Override
	public void visitarVagonHistorico(VagonDePasajerosAntiguo vagon) {
		
		
	}

	@Override
	public void visitarVagonDeZorra(VagonDeZorra vagon) {
		
		
	}

}
