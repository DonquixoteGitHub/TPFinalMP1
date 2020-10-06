package Visitor;

import Vagon.VagonDeCarga;
import Vagon.VagonDePasajeros;
import Vagon.VagonDePasajerosAntiguo;

public interface Visitante {

	void visitarVagonDeCarga(VagonDeCarga vagon);
	void visitarVagonDePasajeros(VagonDePasajeros vagon);
	void visitarVagonHistorico(VagonDePasajerosAntiguo vagon);
	void visitarVagonDeZorra(VagonDeZorra vagon);
}
