package Facade;

import java.util.ArrayList;

import Locomotora.Locomotora;
import Locomotora.Motor;
import Maquinista.Maquinista;
import Tren.Tren;
import Vagon.Vagon;

public class TrenFacade {

	
	Tren tren;
	Locomotora locomotora;
	Motor motor;
	Maquinista maquinista;
	ArrayList<Vagon> vagones;
	
	public TrenFacade(Tren t){
		tren=t;
		locomotora=t.getLocomotora();
		motor=t.getLocomotora().getMotor();
		maquinista=t.getLocomotora().getMaquinista();
		vagones=t.getVagones();
	}
	
	public void horaDeArribo(String hora){
		tren.horaDeArribo(hora);
	}
	public void todoEnOrden(){
		maquinista.todoEnOrden();
	}
	public void reportarEstadoParaProximoTramo(){
		locomotora.reportarEstadoParaProximoTramo();
		
	}
	public void existenFallas() {
		maquinista.existenFallas();
	}
	public void reportarProblemas() {
		for(Vagon v : vagones)
			v.reportarProblemas();
	}
	public void revisarFrenos() {
		for(Vagon v : vagones)
			v.revisarFrenos();
	}
	public void recargarCombustible() {
		locomotora.recargarCombustible();
	}
	public void hacerRevision() {
		motor.hacerRevision();
	}
}
