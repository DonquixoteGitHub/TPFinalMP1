package Interpreter;

import java.util.ArrayList;

import Maquinista.Maquinista;

public class MaquinistaRobot extends Maquinista{

	ExpresionAbstracta expresion;
	
	public MaquinistaRobot(String nombre) {
		super(nombre);
	}
	
	public void interpretar(ArrayList<String> prog) {
		expresion=ExpresionAbstracta.interpretar(prog, 0);
	}
	
	public void ejecutar() {
		expresion.ejecutar(locomotora);
	}

}
