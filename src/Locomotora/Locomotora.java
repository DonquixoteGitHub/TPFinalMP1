package Locomotora;
import Maquinista.Maquinista;
import Prototype.PrototipoClonable;


public abstract class Locomotora implements PrototipoClonable {

	private Maquinista maquinista;
	private Motor motor;
	private double longitud;
	private double peso;
	
	private LocomotoraImp implementacion;//bridge
	
	public Locomotora(LocomotoraImp imp) {//bridge
		implementacion=imp;
	}
	public Locomotora() {}//constructor vacio, eliminar luego de resolver dudas con el bridge
	
	public abstract void encenderMotor();
	public abstract void enMarcha();
	public abstract void apagarMotor();
	public Motor getMotor(){
		return this.motor;
	}
	public Maquinista getMaquinista(){
		return this.maquinista;
	}
	public void setMaquinista(Maquinista m){
		this.maquinista=m;
		m.estoyListo();
	}
	public void reportarEstadoParaProximoTramo(){
		System.out.println("listo para reportar proximo tramo");
	}
	public abstract void recargarCombustible();
	public abstract Locomotora clonar();
	
	private void reportarEstado() {
		implementacion.reportarEstado();
	}
	
	public void reportarEstado() {
		this.recargarCombustible();
		this.reportarFallas();
		this.reportarEstadoDelChasis();
		this.reportarSistemaDeFrenos();
		this.reportarMotor();
		this.reportarComandos();
		
	}
	
	public abstract void reportarCombustible();
	public abstract void reportarFallas();
	public abstract void reportarEstadoDelChasis();
	public abstract void reportarSistemaDeFrenos();
	public abstract void reportarMotor();
	public abstract void reportarComandos();
	
	
	public void acelerar() {//state
		this.motor.acelerar();
	}
	public void apagar() {
		this.motor.apagar();
	}
	public void encender() {
		this.motor.encender();
	}
	public void desacelerar() {
		this.motor.desacelerar();
	}
	public void frenar() {
		this.motor.frenar();
	}
	public void arreglar() {
		this.motor.arreglar();
	}
}
