package Tren;

import java.util.ArrayList;

import Iterator.Iterador;
import Iterator.IteradorDeVagones;
import Locomotora.Locomotora;
import Locomotora.Motor;
import Prototype.PrototipoClonable;
import Prototype.TrenClonable;
import Vagon.Vagon;


public class Tren implements TrenClonable{
private Locomotora locomotora;
private String horaDeArribo;
private Motor motor;

private ArrayList<Vagon> vagones;

public void agregarLocomotora(Locomotora l){
	this.locomotora=l;
	l.encenderMotor();
}

public void agregarVagon(Vagon v){
	vagones.add(v);
	v.enganchar();
}

public void realizarRecorrido(){
	locomotora.enMarcha();
	for(Vagon v : vagones){
		v.liberarFrenos();
	}
}

public Tren clonar(){
	Tren tren=new Tren();
	tren.agregarLocomotora(locomotora.clonar());
	for (Vagon v:vagones)
		tren.agregarVagon(v.clonar());
	motor.clonar();
	return tren;
	
}

public Locomotora getLocomotora(){
	return this.locomotora;
}

public ArrayList<Vagon> getVagones(){
	return this.vagones;
}

public void horaDeArribo(String hora){//facade
	this.horaDeArribo=hora;
}

public Iterador crearIterdaor() {//iterator
	return new IteradorDeVagones(this);
}


}
